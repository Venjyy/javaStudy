import java.util.ArrayList;
import java.util.List;

public class GestorMesas {
    private static GestorMesas instancia;
    private List<Mesa> mesas = new ArrayList<>();

    private GestorMesas() {
    }

    public static synchronized GestorMesas getInstancia() {
        if (instancia == null) {
            instancia = new GestorMesas();
        }
        return instancia;
    }

    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public Mesa crearMesaBase(int numero, int capacidad, String tipo) {
        return new Mesa(numero, capacidad, tipo);
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public Mesa buscarMesa(int numero) {
        return mesas.stream()
                .filter(m -> m.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }
}