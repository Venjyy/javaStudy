public class ControlStockUI implements ControlStockImpl {
    @Override
    public void actualizarStock(Producto producto, int cantidad) {
        System.out.println("Actualizando stock de " + producto.toString() + " a " + cantidad + " unidades");
    }
}