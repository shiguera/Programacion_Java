public class LuzInteligente implements Encendible, Regulable {
    private static final int PASO = 10;

    private boolean encendida;
    private int intensidad; // entre 0 y 100

    public LuzInteligente() {
        this.encendida = false;
        this.intensidad = 0;
    }

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Luz encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Luz apagada.");
    }

    @Override
    public boolean consultarEncendido() {
        return encendida;
    }

    @Override
    public void subirIntensidad() {
        intensidad = Math.min(100, intensidad + PASO);
        System.out.println("Intensidad subida a " + intensidad + ".");
    }

    @Override
    public void bajarIntensidad() {
        intensidad = Math.max(0, intensidad - PASO);
        System.out.println("Intensidad bajada a " + intensidad + ".");
    }
}
