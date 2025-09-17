package Facade;

public class MainFacade {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio();

        TiendaFacade TiendaComprar = new TiendaFacade(carrito, pago, envio);

        TiendaComprar.Comprar("Plei3");
        TiendaComprar.TerminarCompra();
    }
}
