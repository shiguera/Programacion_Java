public class TimeoutConexionException extends ErrorRedException {
    private final int milisegundosEspera;

    public TimeoutConexionException(String idDispositivo, int milisegundosEspera) {
        super("Timeout al conectar con " + idDispositivo + " tras " + milisegundosEspera + " ms");
        this.milisegundosEspera = milisegundosEspera;
    }

    public int getMilisegundosEspera() {
        return milisegundosEspera;
    }
}
