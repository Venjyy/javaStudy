public class SistemaReservasUI implements SistemaReservasImpl {
    @Override
    public void mostrarReserva(String cliente, Mesa mesa) {
        System.out.println(
                "Reserva confirmada para " + cliente + " en mesa " + mesa.getNumero() + " (" + mesa.getTipo() + ")");
    }
}