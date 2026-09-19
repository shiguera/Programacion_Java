public class Conductor {
    private String nombre;
    private String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    @Override
    public String toString() {
        return nombre + " (licencia " + licencia + ")";
    }
}
