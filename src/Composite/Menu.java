package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {
    private String nombremenu;
    private List<ElementoMenu> elementos = new ArrayList<>();
    public Menu(String nombremenu) {
        this.nombremenu = nombremenu;
    }
    public void sumarplato(ElementoMenu elemento) {
        elementos.add(elemento);
    }
    @Override
    public void mostrar(String texto) {
        System.out.println(texto + " " + nombremenu);
        for (ElementoMenu elemento : elementos) {
            elemento.mostrar(texto + "  ");
        }
    }
}
