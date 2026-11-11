// Misma clase ConexionSimulada que aparece en el Ejemplo del capítulo
// (apartado de AutoCloseable/try-with-resources), reutilizada aquí porque
// este ejercicio se centra en el bloque finally, no en try-with-resources.
public class ConexionSimulada {

    private final String destino;
    private boolean abierta;

    public ConexionSimulada(String destino) {
        this.destino = destino;
        this.abierta = true;
        System.out.println("Conexión abierta con " + destino);
    }

    public void enviarDatos(String datos) {
        if (!abierta) {
            throw new IllegalStateException("Conexión cerrada");
        }
        System.out.println("Enviando a " + destino + ": " + datos);
    }

    public void close() {
        abierta = false;
        System.out.println("Conexión cerrada con " + destino);
    }
}
