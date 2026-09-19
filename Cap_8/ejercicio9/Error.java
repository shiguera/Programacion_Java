public non-sealed class Error extends ResultadoRed {
    private String mensaje;
    private int codigo;

    public Error(String mensaje, int codigo) {
        this.mensaje = mensaje;
        this.codigo = codigo;
    }

    protected String getMensaje() {
        return mensaje;
    }

    protected int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Error[mensaje=" + mensaje + ", codigo=" + codigo + "]";
    }
}
