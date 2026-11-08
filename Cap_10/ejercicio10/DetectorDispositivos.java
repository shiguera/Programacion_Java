public class DetectorDispositivos implements Plugin {
    private int dispositivosConocidos;

    public DetectorDispositivos() {
        this.dispositivosConocidos = 0;
    }

    @Override
    public void inicializar() {
        dispositivosConocidos = 0;
        System.out.println(getNombre() + ": inicializado.");
    }

    @Override
    public void ejecutar() {
        dispositivosConocidos++;
        System.out.println(getNombre() + ": detectado dispositivo nuevo (total conocidos: "
                + dispositivosConocidos + ").");
    }

    @Override
    public void detener() {
        System.out.println(getNombre() + ": detenido.");
    }
}
