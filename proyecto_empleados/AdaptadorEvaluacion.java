public class AdaptadorEvaluacion {
    private SistemaExternoEvaluacion sistemaExterno = new SistemaExternoEvaluacion();

    public void evaluarEmpleado(Empleado empleado, int puntaje) {
        sistemaExterno.evaluarEmpleadoExterno(empleado.getNombre(), puntaje);
    }
}