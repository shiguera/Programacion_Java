public final class Exito extends ResultadoRed {
    private String datos;

    public Exito(String datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Exito[datos=" + datos + "]";
    }
}
