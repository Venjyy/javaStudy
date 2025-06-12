public class GestionReservasUI implements GestionReservasImpl {
    @Override
    public void mostrarReserva(String detalle) {
        System.out.println("=== RESERVA DE VUELO ===");
        System.out.println(detalle);
        System.out.println("========================");
    }
}