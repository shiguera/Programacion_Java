public class Producto implements Describible {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return "Producto: " + nombre + " (" + precio + " €)";
    }
}
