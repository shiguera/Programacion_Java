public class AnalizadorMensajes {

    public static void analizar(String mensaje) {
        if (!mensaje.contains(":")) {
            throw new FormatoMensajeException(mensaje);
        }
        String[] partes = mensaje.split(":", 2);
        System.out.println("Tipo: " + partes[0] + " | Contenido: " + partes[1]);
    }
}
