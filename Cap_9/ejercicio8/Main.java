public class Main {

    // Pattern matching en switch (Java 21): al ser Mensaje una jerarquía
    // sellada (sealed) con exactamente tres subclases permitidas, el
    // compilador puede comprobar que el switch es EXHAUSTIVO sin
    // necesidad de una rama default. Si se añadiera una nueva subclase
    // permitida a Mensaje y no se actualizara este switch, el compilador
    // directamente rechazaría la compilación.
    public static String procesarMensaje(Mensaje m) {
        return switch (m) {
            case MensajeTexto t -> "Mensaje de texto: \"" + t.getContenido() + "\"";
            case MensajeImagen i -> "Mensaje de imagen con resolución " + i.getResolucion();
            case MensajeAudio a -> "Mensaje de audio de " + a.getDuracionSegundos() + " segundos";
        };
    }

    public static void main(String[] args) {
        Mensaje[] mensajes = {
                new MensajeTexto("Hola, ¿cómo estás?"),
                new MensajeImagen("1920x1080"),
                new MensajeAudio(45)
        };

        for (Mensaje m : mensajes) {
            System.out.println(procesarMensaje(m));
        }

        // Si se comenta cualquiera de las tres ramas "case" de
        // procesarMensaje(), el compilador rechaza el código con un error
        // de exhaustividad ("the switch expression does not cover all
        // possible input values"), confirmando que no hace falta (ni se
        // permite omitir) una rama default.
    }
}
