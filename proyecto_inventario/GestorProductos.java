import java.util.ArrayList;
import java.util.List;

public class GestorProductos {
    private static GestorProductos instancia;
    private List<Producto> productos = new ArrayList<>();

    private GestorProductos() {
    }

    public static synchronized GestorProductos getInstancia() {
        if (instancia == null) {
            instancia = new GestorProductos();
        }
        return instancia;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto crearProductoBase(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Producto buscarProducto(String nombre) {
        return productos.stream()
                .filter(p -> p.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }
}