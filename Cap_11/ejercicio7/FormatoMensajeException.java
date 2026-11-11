public class FormatoMensajeException extends RuntimeException {
    private final String mensajeOriginal;

    public FormatoMensajeException(String mensajeOriginal) {
        super("Formato de mensaje inválido (se esperaba \"TIPO:CONTENIDO\"): \""
                + mensajeOriginal + "\"");
        this.mensajeOriginal = mensajeOriginal;
    }

    public String getMensajeOriginal() {
        return mensajeOriginal;
    }
}
