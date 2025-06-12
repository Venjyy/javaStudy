public class AsignacionTareasUI implements AsignacionTareasImpl {
    @Override
    public void asignarTarea(String empleado, String tarea) {
        System.out.println("Tarea asignada: " + empleado + " -> " + tarea);
    }
}