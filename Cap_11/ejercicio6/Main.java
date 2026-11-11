public class Main {
    public static void main(String[] args) {
        String[] direcciones = { "8.8.8.8", "192.168.1.10" };

        for (String ip : direcciones) {
            try {
                GestorConexiones.conectar(ip);
            } catch (ConexionRechazadaException e) {
                System.out.println(e.getMessage());
                System.out.println("Dirección IP rechazada: " + e.getDireccionIp());
            }
        }
    }
}
