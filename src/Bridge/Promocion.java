package Bridge;

public class Promocion extends MetodoEnvio {
    public Promocion(TipoNotificacion tiponotificacion) {
        super(tiponotificacion);
    }

    @Override
    public void envio() {
        System.out.println("Enviando promocion del tipo " + tiponotificacion.tipo());
    }
}