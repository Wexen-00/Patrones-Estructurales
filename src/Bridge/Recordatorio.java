package Bridge;

public class Recordatorio extends MetodoEnvio{
    public Recordatorio(TipoNotificacion tiponotificacion) {
        super (tiponotificacion);
    }
    @Override
    public void envio() {
        System.out.println("Enviando recordatorio del tipo " +  tiponotificacion.tipo());
    }
}
