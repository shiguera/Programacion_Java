public class Empleado implements Describible {
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public String getDescripcion() {
        return "Empleado: " + nombre + ", puesto: " + puesto;
    }
}
