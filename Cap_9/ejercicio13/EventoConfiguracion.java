public final class EventoConfiguracion extends Evento {
    private String parametro;
    private String valorNuevo;

    public EventoConfiguracion(String timestamp, String origen, String parametro, String valorNuevo) {
        super(timestamp, origen);
        this.parametro = parametro;
        this.valorNuevo = valorNuevo;
    }

    public String getParametro() {
        return parametro;
    }

    public String getValorNuevo() {
        return valorNuevo;
    }

    @Override
    public String procesar() {
        return "[" + timestamp + "] " + origen + " -> parámetro '" + parametro
                + "' actualizado a '" + valorNuevo + "'";
    }
}
