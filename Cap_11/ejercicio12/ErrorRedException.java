// Excepción base del dominio: comprobada, porque los tres tipos de error
// de red que se modelan a continuación son situaciones que el código
// cliente puede anticipar y de las que, en un simulador, tiene sentido
// recuperarse (reintentar, descartar un paquete, etc.).
public abstract class ErrorRedException extends Exception {

    public ErrorRedException(String mensaje) {
        super(mensaje);
    }

    public ErrorRedException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
