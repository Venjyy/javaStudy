public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===");

        // Singleton y Prototype
        GestorEmpleados gestor = GestorEmpleados.getInstancia();
        Empleado base = gestor.crearEmpleadoBase("Juan Pérez", "Desarrollador");
        gestor.agregarEmpleado(base);

        Empleado clon = base.clone();
        clon.setNombre("María García");
        clon.setPuesto("Desarrolladora Senior");
        gestor.agregarEmpleado(clon);

        // Bridge
        AsignacionTareas tareas = new AsignacionTareas(new AsignacionTareasUI());
        tareas.asignar(base, "Desarrollar módulo de inventario");
        tareas.asignar(clon, "Revisar código del proyecto");

        // Adapter
        AdaptadorEvaluacion evaluacion = new AdaptadorEvaluacion();
        evaluacion.evaluarEmpleado(base, 8);
        evaluacion.evaluarEmpleado(clon, 9);

        System.out.println("\n=== PATRONES DEMOSTRADOS ===");
        System.out.println("✓ SINGLETON: GestorEmpleados - Una sola instancia");
        System.out.println("✓ PROTOTYPE: Clonación de empleados base");
        System.out.println("✓ BRIDGE: AsignacionTareas con implementación UI");
        System.out.println("✓ ADAPTER: Integración con sistema externo de evaluación");
    }
}