package Proxy;

public class MainProxy {
    public static void main(String[] args) {
        Archivo archivo1 = new ArchivoProxy("admin");
        archivo1.abrir();
        Archivo archivo2 = new ArchivoProxy("usuario");
        archivo2.abrir();
    }
}
