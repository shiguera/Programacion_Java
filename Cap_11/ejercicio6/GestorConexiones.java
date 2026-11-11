public class GestorConexiones {

    public static void conectar(String ip) throws ConexionRechazadaException {
        if (ip.startsWith("192.168.")) {
            throw new ConexionRechazadaException(
                    "Conexión rechazada: la red privada " + ip + " no está permitida",
                    ip);
        }
        System.out.println("Conectado a " + ip);
    }
}
