public final class EventoTrafico extends Evento {
    private int vehiculosPorMinuto;

    public EventoTrafico(String timestamp, String origen, int vehiculosPorMinuto) {
        super(timestamp, origen);
        this.vehiculosPorMinuto = vehiculosPorMinuto;
    }

    public int getVehiculosPorMinuto() {
        return vehiculosPorMinuto;
    }

    @Override
    public String procesar() {
        String estado = (vehiculosPorMinuto > 60) ? "tráfico denso" : "tráfico fluido";
        return "[" + timestamp + "] " + origen + " -> " + estado
                + " (" + vehiculosPorMinuto + " vehículos/min)";
    }
}
