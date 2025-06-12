interface SistemaReservasImpl {
    void mostrarReserva(String cliente, Mesa mesa);
}

public class SistemaReservas {
    protected SistemaReservasImpl implementacion;

    public SistemaReservas(SistemaReservasImpl implementacion) {
        this.implementacion = implementacion;
    }

    public void realizarReserva(String cliente, Mesa mesa) {
        implementacion.mostrarReserva(cliente, mesa);
    }
}