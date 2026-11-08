public class GeneradorInformes implements Plugin {
    private int periodoMinutos;

    public GeneradorInformes(int periodoMinutos) {
        this.periodoMinutos = periodoMinutos;
    }

    @Override
    public void inicializar() {
        System.out.println(getNombre() + ": inicializado (periodo = " + periodoMinutos + " min).");
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + ": generando informe periódico...");
    }

    @Override
    public void detener() {
        System.out.println(getNombre() + ": detenido.");
    }
}
