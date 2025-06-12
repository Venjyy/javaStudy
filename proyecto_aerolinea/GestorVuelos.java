import java.util.ArrayList;
import java.util.List;

public class GestorVuelos {
    private static GestorVuelos instancia;
    private List<Vuelo> vuelos = new ArrayList<>();

    private GestorVuelos() {
    }

    public static synchronized GestorVuelos getInstancia() {
        if (instancia == null) {
            instancia = new GestorVuelos();
        }
        return instancia;
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public Vuelo crearVueloBase(String numero, String origen, String destino, int asientos) {
        return new Vuelo(numero, origen, destino, asientos);
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public Vuelo buscarVuelo(String numero) {
        return vuelos.stream()
                .filter(v -> v.getNumero().equals(numero))
                .findFirst()
                .orElse(null);
    }
}