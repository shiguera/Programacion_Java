import java.util.Set;

// Implementa AutoCloseable porque representa una sesión de simulación que
// mantiene un recurso que debe liberarse al terminar (en un simulador
// real podría ser un socket, un hilo de fondo, etc.); aquí se simula con
// un simple mensaje de apertura y cierre.
public class SimuladorRed implements AutoCloseable {

    private static final Set<String> DISPOSITIVOS_CONOCIDOS = Set.of("router-01", "switch-02", "ap-03");
    private static final String DISPOSITIVO_CON_TIMEOUT = "camara-04";

    private boolean activo;

    public SimuladorRed() {
        this.activo = true;
        System.out.println("Simulador de red iniciado.");
    }

    public void buscarDispositivo(String id) throws DispositivoNoEncontradoException {
        comprobarActivo();
        if (!DISPOSITIVOS_CONOCIDOS.contains(id)) {
            throw new DispositivoNoEncontradoException(id);
        }
        System.out.println("Dispositivo encontrado: " + id);
    }

    public void conectar(String id) throws TimeoutConexionException {
        comprobarActivo();
        if (id.equals(DISPOSITIVO_CON_TIMEOUT)) {
            throw new TimeoutConexionException(id, 5000);
        }
        System.out.println("Conectado a " + id);
    }

    public void enviarPaquete(String contenido) throws PaqueteMalformadoException {
        comprobarActivo();
        if (contenido == null || !contenido.contains(":")) {
            throw new PaqueteMalformadoException(contenido);
        }
        System.out.println("Paquete enviado: " + contenido);
    }

    private void comprobarActivo() {
        if (!activo) {
            throw new IllegalStateException("El simulador ya está detenido");
        }
    }

    @Override
    public void close() {
        activo = false;
        System.out.println("Simulador de red detenido.");
    }
}
