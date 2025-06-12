public class Main {
    public static void main(String[] args) {
        // Singleton y Prototype
        GestorMesas gestor = GestorMesas.getInstancia();
        Mesa base = gestor.crearMesaBase(1, 4, "VIP");
        gestor.agregarMesa(base);

        Mesa clon = base.clone();
        clon.setNumero(2);
        clon.setDisponible(true);
        gestor.agregarMesa(clon);

        // Bridge
        SistemaReservas reservas = new SistemaReservas(new SistemaReservasUI());
        reservas.realizarReserva("Juan Pérez", base);

        // Adapter
        AdaptadorEmail adapter = new AdaptadorEmail();
        adapter.enviarConfirmacionReserva("juan@email.com", "Juan Pérez", base);
    }
}

class AdaptadorEmail {
    private ServicioEmailExterno servicioExterno = new ServicioEmailExterno();

    public void enviarConfirmacionReserva(String email, String cliente, Mesa mesa) {
        String mensaje = "Reserva confirmada para " + cliente + " en mesa " + mesa.getNumero();
        servicioExterno.enviarConfirmacion(email, mensaje);
    }
}