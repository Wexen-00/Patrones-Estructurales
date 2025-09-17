package Bridge;

public class Email implements TipoNotificacion {
    @Override
    public String tipo() {
        return "Email";
    }

}
