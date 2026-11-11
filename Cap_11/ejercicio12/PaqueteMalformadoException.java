public class PaqueteMalformadoException extends ErrorRedException {
    private final String contenidoPaquete;

    public PaqueteMalformadoException(String contenidoPaquete) {
        super("Paquete malformado: \"" + contenidoPaquete + "\"");
        this.contenidoPaquete = contenidoPaquete;
    }

    public String getContenidoPaquete() {
        return contenidoPaquete;
    }
}
