package Flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        String tipo = "Grande";
        String textura = "Gelatinosa";
        String color = "ROJO";
        int x = 0;
        //Ayuda chadGPT
        String[] tipos = {"Grande", "Mediano", "Pequeño"};
        for (String t : tipos) {
            ArbolPosicion arbolPosicion = fabrica.obtenerArbolPosicion(t, textura, color);
            arbolPosicion.posicion(x, 10);
            x += 10;
        }
        //Hasta aca (corrige mi error en String[])

    }
}
