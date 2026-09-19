public class ErrorTimeout extends Error {
    private int tiempoEsperaMs;

    public ErrorTimeout(String mensaje, int codigo, int tiempoEsperaMs) {
        super(mensaje, codigo);
        this.tiempoEsperaMs = tiempoEsperaMs;
    }

    @Override
    public String toString() {
        return "ErrorTimeout[mensaje=" + getMensaje() + ", codigo=" + getCodigo()
                + ", tiempoEsperaMs=" + tiempoEsperaMs + "]";
    }
}
