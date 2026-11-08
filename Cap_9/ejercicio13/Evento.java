public sealed abstract class Evento permits EventoAlarma, EventoTrafico, EventoConfiguracion {
    protected String timestamp;
    protected String origen;

    public Evento(String timestamp, String origen) {
        this.timestamp = timestamp;
        this.origen = origen;
    }

    public abstract String procesar();

    public String getTimestamp() {
        return timestamp;
    }

    public String getOrigen() {
        return origen;
    }
}
