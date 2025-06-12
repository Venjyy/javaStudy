interface GestionReservasImpl {
    void mostrarReserva(String detalle);
}

public class GestionReservas {
    protected GestionReservasImpl implementacion;

    public GestionReservas(GestionReservasImpl implementacion) {
        this.implementacion = implementacion;
    }

    public void mostrarDetalleReserva(Vuelo vuelo) {
        String detalle = "Vuelo " + vuelo.getNumero() + " (" + vuelo.getOrigen() +
                " -> " + vuelo.getDestino() + "), asientos: " + vuelo.getAsientosDisponibles();
        implementacion.mostrarReserva(detalle);
    }
}