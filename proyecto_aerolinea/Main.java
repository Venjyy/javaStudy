public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RESERVAS AÉREAS ===");

        // Singleton y Prototype
        GestorVuelos gestor = GestorVuelos.getInstancia();
        Vuelo base = gestor.crearVueloBase("AV123", "Lima", "Buenos Aires", 150);
        gestor.agregarVuelo(base);

        Vuelo clon = base.clone();
        clon.setNumero("AV124");
        clon.setAsientosDisponibles(120);
        gestor.agregarVuelo(clon);

        // Bridge
        GestionReservas reservas = new GestionReservas(new GestionReservasUI());
        reservas.mostrarDetalleReserva(base);
        reservas.mostrarDetalleReserva(clon);

        // Adapter
        PasarelaPago pago = new AdaptadorPayPal();
        pago.realizarPago(450.50);
        pago.realizarPago(380.75);

        System.out.println("\n=== PATRONES DEMOSTRADOS ===");
        System.out.println("✓ SINGLETON: GestorVuelos - Una sola instancia");
        System.out.println("✓ PROTOTYPE: Clonación de vuelos base");
        System.out.println("✓ BRIDGE: GestionReservas con implementación UI");
        System.out.println("✓ ADAPTER: Integración con PayPal");
    }
}