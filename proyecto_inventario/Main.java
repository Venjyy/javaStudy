public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE INVENTARIO ===");

        // Singleton y Prototype
        GestorProductos gestor = GestorProductos.getInstancia();
        Producto base = gestor.crearProductoBase("Laptop", 999.99, 10);
        gestor.agregarProducto(base);

        Producto clon = base.clone();
        clon.setStock(5);
        gestor.agregarProducto(clon);

        // Bridge
        ControlStock control = new ControlStock(new ControlStockUI());
        control.gestionarStock(base, 8);
        control.gestionarStock(clon, 3);

        // Adapter
        AdaptadorPedidos adapter = new AdaptadorPedidos();
        adapter.procesarPedido(base, 2);
        adapter.procesarPedido(clon, 1);

        System.out.println("\n=== PATRONES DEMOSTRADOS ===");
        System.out.println("✓ SINGLETON: GestorProductos - Una sola instancia");
        System.out.println("✓ PROTOTYPE: Clonación de productos base");
        System.out.println("✓ BRIDGE: ControlStock con implementación UI");
        System.out.println("✓ ADAPTER: Integración con sistema externo de pedidos");
    }
}