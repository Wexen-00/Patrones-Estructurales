package Adapter;

public class AdaptadorImprimir implements Imprimir{
    private ImprimirPDF ImprimirPDF;
    public AdaptadorImprimir() {
        ImprimirPDF = new ImprimirPDF();
    }
    @Override
    public void imprimir(String nombre) {
        if (nombre.equalsIgnoreCase("imprimirPDF")) {
            ImprimirPDF.imprimirPDF(nombre);
        } else  {
            System.out.println("No soportado");
        }
    }
}
