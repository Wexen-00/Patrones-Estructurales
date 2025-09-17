package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;
    public TiendaFacade(Carrito carrito, Pago pago, Envio envio) {
        this.envio = envio;
        this.pago = pago;
        this.carrito = carrito;
    }
    public void Comprar(String producto){
        System.out.println("Preparando compra, espere...");
        carrito.GestionarProductos();
        pago.ProcesarPago();
        envio.CoordinarEntrega(producto);
    }
    public void TerminarCompra(){
        System.out.println("Terminando compra, espere...");
        envio.CoordinarEntregaT();
    }
}
