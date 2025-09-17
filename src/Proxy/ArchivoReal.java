package Proxy;

public class ArchivoReal implements Archivo {
    private String archivopesado;
    public ArchivoReal(String archivopesado) {
        this.archivopesado = archivopesado;
    }
    @Override
    public void abrir() {
        System.out.println("Abriendo" + archivopesado);
    }
}
