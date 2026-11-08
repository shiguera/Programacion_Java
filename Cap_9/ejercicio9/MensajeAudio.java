public final class MensajeAudio extends Mensaje {
    private int duracionSegundos;

    public MensajeAudio(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }
}
