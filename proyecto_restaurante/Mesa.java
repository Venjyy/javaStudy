public class Mesa implements Cloneable {
    private int numero;
    private int capacidad;
    private String tipo;
    private boolean disponible;

    public Mesa(int numero, int capacidad, String tipo) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.disponible = true;
    }

    @Override
    public Mesa clone() {
        return new Mesa(this.numero, this.capacidad, this.tipo);
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}