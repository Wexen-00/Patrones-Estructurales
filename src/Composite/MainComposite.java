package Composite;

public class MainComposite {
    public static void main(String[] args) {
        ElementoMenu plato1 = new Plato("Milanga");
        ElementoMenu plato2 = new Plato("Asado");
        ElementoMenu plato3 = new Plato("Sushi");

        Menu menu2 = new Menu("SubMenu Pescados");
        menu2.sumarplato(plato3);

        Menu menu1 = new Menu("Menu Carnes");
        menu1.sumarplato(plato1);
        menu1.sumarplato(plato2);
        menu1.sumarplato(menu2);

        menu1.mostrar("");
    }
}
