package Flyweight;

public class ArbolTipo implements ArbolPosicion {
    private final String tipo;
    private final String textura;
    private final String color;
    public ArbolTipo(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
        System.out.println("Creando objeto arbol de tipo " + tipo);
        System.out.println("Creando objeto arbol de textura " + textura);
        System.out.println("Creando objeto arbol de color " + color);
    }
    @Override
    public void posicion(int x, int y) {
        System.out.println("Arbol del tipo " + tipo + "en posicion " + x + ", " + y);
    }
}
