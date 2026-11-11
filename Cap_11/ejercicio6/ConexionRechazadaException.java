public class ConexionRechazadaException extends Exception {
    private final String direccionIp;

    public ConexionRechazadaException(String mensaje, String direccionIp) {
        super(mensaje);
        this.direccionIp = direccionIp;
    }

    public ConexionRechazadaException(String mensaje, String direccionIp, Throwable causa) {
        super(mensaje, causa);
        this.direccionIp = direccionIp;
    }

    public String getDireccionIp() {
        return direccionIp;
    }
}
