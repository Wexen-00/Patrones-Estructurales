package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, ArbolPosicion> arbolPosiciones = new HashMap<>();
    public ArbolPosicion obtenerArbolPosicion(String tipo, String textura, String color) {
        //Ayuda ChadGPT
        String clave = tipo + "-" + textura + "-" + color;
        ArbolPosicion arbolPosicion = arbolPosiciones.get(clave);
        //Hasta aca, corrige error en Map.get(), recibe 1 clave, no tres
        if (arbolPosicion == null) {
            arbolPosicion = new ArbolTipo(tipo, color, textura);
            arbolPosiciones.put(clave, arbolPosicion);
        }
        return arbolPosicion;

    }
}
