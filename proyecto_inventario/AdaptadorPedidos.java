public class AdaptadorPedidos {
    private SistemaExternoPedidos sistemaExterno = new SistemaExternoPedidos();

    public void procesarPedido(Producto producto, int cantidad) {
        sistemaExterno.realizarPedidoExterno(producto.getNombre(), cantidad);
    }
}