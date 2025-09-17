package Proxy;

public class ArchivoProxy implements Archivo {
    private ArchivoReal archivoreal;
    private String clientetipo;
    public ArchivoProxy(String clientetipo) {
        this.clientetipo = clientetipo;
    }
    @Override
    public void abrir() {
        if ("admin".equals(clientetipo)) {
            System.out.println("Verificando tipo de cliente");
            if (archivoreal == null) {
                archivoreal = new ArchivoReal("Pesadisimo");
            }
            archivoreal.abrir();
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
