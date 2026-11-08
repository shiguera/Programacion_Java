public final class EventoAlarma extends Evento {
    private int nivelGravedad; // 1 (leve) a 5 (crítico)

    public EventoAlarma(String timestamp, String origen, int nivelGravedad) {
        super(timestamp, origen);
        this.nivelGravedad = nivelGravedad;
    }

    public int getNivelGravedad() {
        return nivelGravedad;
    }

    @Override
    public String procesar() {
        String urgencia = (nivelGravedad >= 4) ? "ALERTA CRÍTICA" : "aviso";
        return "[" + timestamp + "] " + origen + " -> " + urgencia
                + " (gravedad " + nivelGravedad + ")";
    }
}
