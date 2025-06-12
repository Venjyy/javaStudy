public class Empleado implements Cloneable {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;
    }

    @Override
    public Empleado clone() {
        return new Empleado(this.nombre, this.puesto);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}