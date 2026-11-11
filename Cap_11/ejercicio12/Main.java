public class Main {
    public static void main(String[] args) {
        // try-with-resources: garantiza que el simulador se detiene
        // (close()) al salir del bloque, se produzcan o no excepciones.
        try (SimuladorRed simulador = new SimuladorRed()) {

            try {
                simulador.buscarDispositivo("router-99"); // no existe
            } catch (DispositivoNoEncontradoException e) {
                // Tratamiento específico: el dispositivo puede, por
                // ejemplo, descartarse de una lista de pendientes.
                System.out.println("Dispositivo no encontrado: " + e.getIdDispositivo()
                        + " -> se descarta de la lista de pendientes.");
            }

            try {
                // Ambas llamadas comparten el mismo try, así que el
                // compilador acepta el multi-catch: dentro de ESTE bloque
                // sí pueden producirse los dos tipos de excepción (si se
                // hubieran puesto en try distintos, cada uno solo podría
                // lanzar una de las dos, y el compilador rechazaría el
                // tipo que ese try concreto nunca lanza).
                simulador.conectar("camara-04");        // provoca timeout
                simulador.enviarPaquete("datos sin formato"); // sin ":"
            } catch (TimeoutConexionException | PaqueteMalformadoException e) {
                // Multi-catch: ambos casos se tratan igual aquí, como un
                // fallo transitorio sobre el que solo se registra el
                // incidente y se continúa con el siguiente dispositivo.
                System.out.println("Fallo transitorio (" + e.getClass().getSimpleName()
                        + "): " + e.getMessage());
            }

            try {
                simulador.buscarDispositivo("switch-02"); // sin errores
                simulador.conectar("switch-02");
                simulador.enviarPaquete("DATOS:12345");
            } catch (ErrorRedException e) {
                // Captura genérica de respaldo sobre la clase base, por
                // si se añadiera un nuevo tipo de error en el futuro.
                System.out.println("Error de red no tratado específicamente: " + e.getMessage());
            }

        } // close() se invoca aquí automáticamente.

        System.out.println("Fin del programa.");
    }
}
