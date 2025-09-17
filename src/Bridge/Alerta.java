package Bridge;

public class Alerta extends MetodoEnvio{
    public Alerta(TipoNotificacion tiponotificacion) {
        super(tiponotificacion);
    }
    @Override
    public void envio() {
        System.out.println("Enviando alerta del tipo " +  tiponotificacion.tipo());
    }

}
