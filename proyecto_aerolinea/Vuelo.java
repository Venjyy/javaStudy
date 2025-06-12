public class Vuelo implements Cloneable {
    private String numero;
    private String origen;
    private String destino;
    private int asientosDisponibles;

    public Vuelo(String numero, String origen, String destino, int asientos) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.asientosDisponibles = asientos;
    }

    @Override
    public Vuelo clone() {
        return new Vuelo(this.numero, this.origen, this.destino, this.asientosDisponibles);
    }

    // Getters y setters
    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientos) {
        this.asientosDisponibles = asientos;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}