public class Main {

    public static void usarConexion(String destino, boolean provocarFallo) {
        ConexionSimulada conexion = new ConexionSimulada(destino);
        try {
            conexion.enviarDatos("PING");
            if (provocarFallo) {
                // Excepción provocada artificialmente para comprobar que
                // el bloque finally se ejecuta igualmente.
                throw new RuntimeException("Fallo simulado durante el uso de la conexión");
            }
            conexion.enviarDatos("GET /status");
        } finally {
            // Se ejecuta tanto si provocarFallo es true como si es false.
            conexion.close();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Uso sin fallo ---");
        usarConexion("192.168.1.1", false);

        System.out.println();
        System.out.println("--- Uso con fallo ---");
        try {
            usarConexion("192.168.1.2", true);
        } catch (RuntimeException e) {
            System.out.println("Excepción capturada en Main: " + e.getMessage());
        }
        // El mensaje "Conexión cerrada con 192.168.1.2" se habrá impreso
        // ANTES de llegar aquí, confirmando que finally se ejecutó incluso
        // aunque la excepción se propagara fuera de usarConexion().
    }
}
