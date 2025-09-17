package Bridge;

public class SMS implements TipoNotificacion {
    @Override
    public String tipo() {
        return "SMS";
    }
}
