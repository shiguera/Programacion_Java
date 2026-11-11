public class Main {
    public static void main(String[] args) {
        String[] mensajes = { "ALARMA:temperatura alta", "mensaje sin separador" };

        for (String m : mensajes) {
            try {
                AnalizadorMensajes.analizar(m);
            } catch (FormatoMensajeException e) {
                // FormatoMensajeException es no comprobada (extiende
                // RuntimeException), así que analizar() no necesita
                // declararla con throws; aun así se puede capturar aquí
                // si el llamador quiere tratarla.
                System.out.println(e.getMessage());
            }
        }
    }
}
