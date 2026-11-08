public class MonitorAnchoBanda implements Plugin {
    private double umbralMbps;

    public MonitorAnchoBanda(double umbralMbps) {
        this.umbralMbps = umbralMbps;
    }

    @Override
    public void inicializar() {
        System.out.println(getNombre() + ": inicializado (umbral = " + umbralMbps + " Mbps).");
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + ": monitorizando ancho de banda...");
    }

    @Override
    public void detener() {
        System.out.println(getNombre() + ": detenido.");
    }
}
