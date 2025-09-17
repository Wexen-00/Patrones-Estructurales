package Bridge;

public class MainBridge {
    public static void main(String[] args) {
        MetodoEnvio Recordatorio = new Recordatorio(new Email());
        MetodoEnvio Alerta = new Alerta(new SMS());
        MetodoEnvio Promocion = new Promocion(new SMS());
        Recordatorio.envio();
        Alerta.envio();
        Promocion.envio();
    }
}
