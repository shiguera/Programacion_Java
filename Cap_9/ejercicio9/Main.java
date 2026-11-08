public class Main {

    // Versión CORRECTA: la guarda "duracionSegundos < 60" va en la rama
    // más específica, ANTES de la rama general de MensajeAudio. El orden
    // es relevante porque las ramas de un switch con patrones se evalúan
    // de arriba a abajo y se ejecuta la primera que coincide.
    public static String procesarMensaje(Mensaje m) {
        return switch (m) {
            case MensajeTexto t -> "Mensaje de texto: \"" + t.getContenido() + "\"";
            case MensajeImagen i -> "Mensaje de imagen con resolución " + i.getResolucion();
            case MensajeAudio a when a.getDuracionSegundos() < 60 ->
                    "Audio corto (" + a.getDuracionSegundos() + " s)";
            case MensajeAudio a ->
                    "Audio largo (" + a.getDuracionSegundos() + " s)";
        };
    }

    // Versión INCORRECTA, solo para comprobar el efecto del orden: la
    // rama general de MensajeAudio se coloca ANTES que la guardada. Como
    // "case MensajeAudio a" sin guarda coincide con CUALQUIER MensajeAudio,
    // la rama guardada que viene después queda inalcanzable y el
    // compilador rechaza el código con un error de tipo
    // "this case label is dominated by a preceding case label".
    //
    // public static String procesarMensajeMalOrdenado(Mensaje m) {
    //     return switch (m) {
    //         case MensajeTexto t -> "Mensaje de texto: \"" + t.getContenido() + "\"";
    //         case MensajeImagen i -> "Mensaje de imagen con resolución " + i.getResolucion();
    //         case MensajeAudio a -> "Audio largo (" + a.getDuracionSegundos() + " s)";
    //         case MensajeAudio a when a.getDuracionSegundos() < 60 ->
    //                 "Audio corto (" + a.getDuracionSegundos() + " s)"; // inalcanzable
    //     };
    // }

    public static void main(String[] args) {
        Mensaje[] mensajes = {
                new MensajeTexto("Hola"),
                new MensajeImagen("1920x1080"),
                new MensajeAudio(30),  // corto
                new MensajeAudio(180)  // largo
        };

        for (Mensaje m : mensajes) {
            System.out.println(procesarMensaje(m));
        }
    }
}
