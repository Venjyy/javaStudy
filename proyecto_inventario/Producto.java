public class Producto implements Cloneable {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public Producto clone() {
        return new Producto(this.nombre, this.precio, this.stock);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}