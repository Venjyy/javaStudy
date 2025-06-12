import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private static GestorEmpleados instancia;
    private List<Empleado> empleados = new ArrayList<>();

    private GestorEmpleados() {
    }

    public static synchronized GestorEmpleados getInstancia() {
        if (instancia == null) {
            instancia = new GestorEmpleados();
        }
        return instancia;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado crearEmpleadoBase(String nombre, String puesto) {
        return new Empleado(nombre, puesto);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado buscarEmpleado(String nombre) {
        return empleados.stream()
                .filter(e -> e.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }
}