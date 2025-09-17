package Adapter;

public class MainAdapter {
    public static void main(String[] args) {
        ImprimirPlano plano = new ImprimirPlano();
        plano.imprimir("ImprimirPDF");
        plano.imprimir("ImprimirPNG");
        plano.imprimir("ImprimirPlano");
    }
}