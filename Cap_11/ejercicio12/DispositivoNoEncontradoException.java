public class DispositivoNoEncontradoException extends ErrorRedException {
    private final String idDispositivo;

    public DispositivoNoEncontradoException(String idDispositivo) {
        super("Dispositivo no encontrado: " + idDispositivo);
        this.idDispositivo = idDispositivo;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }
}
