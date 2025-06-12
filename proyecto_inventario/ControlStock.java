interface ControlStockImpl {
    void actualizarStock(Producto producto, int cantidad);
}

public class ControlStock {
    protected ControlStockImpl implementacion;

    public ControlStock(ControlStockImpl implementacion) {
        this.implementacion = implementacion;
    }

    public void gestionarStock(Producto producto, int cantidad) {
        implementacion.actualizarStock(producto, cantidad);
    }
}