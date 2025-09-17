package Composite;

public class Plato implements ElementoMenu {
    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void mostrar(String texto) {
        System.out.println(texto + " " + nombre);
    }
}
