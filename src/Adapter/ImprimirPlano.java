package Adapter;

public class ImprimirPlano implements Imprimir{
    private AdaptadorImprimir AdaptadorImprimir;
    @Override
    public void imprimir(String nombre) {
        if(nombre.equalsIgnoreCase("ImprimirPlano")){
            System.out.println("Se imprime con Plano "+ nombre);
        } else {
            AdaptadorImprimir = new AdaptadorImprimir();
            AdaptadorImprimir.imprimir(nombre);
        }
    }
}
