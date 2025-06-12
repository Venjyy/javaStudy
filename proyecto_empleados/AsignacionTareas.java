interface AsignacionTareasImpl {
    void asignarTarea(String empleado, String tarea);
}

public class AsignacionTareas {
    protected AsignacionTareasImpl implementacion;

    public AsignacionTareas(AsignacionTareasImpl implementacion) {
        this.implementacion = implementacion;
    }

    public void asignar(Empleado empleado, String tarea) {
        implementacion.asignarTarea(empleado.getNombre(), tarea);
    }
}