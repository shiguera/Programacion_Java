import java.util.Objects;

public class Producto {
    private String nombre;
    private String descripcion;

    public Producto(String nombre, String descripcion) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre del producto no puede ser null");
        this.descripcion = descripcion;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + Objects.toString(descripcion, "(sin descripción)"));
    }

    public static void main(String[] args) {
        Producto conDescripcion = new Producto("Teclado", "Teclado mecánico retroiluminado");
        Producto sinDescripcion = new Producto("Ratón", null);

        conDescripcion.mostrar();
        sinDescripcion.mostrar();

        // La siguiente línea lanza una NullPointerException al ejecutarse,
        // con el mensaje "El nombre del producto no puede ser null", ya que
        // Objects.requireNonNull() interrumpe el programa inmediatamente si
        // el valor recibido es null.
        Producto invalido = new Producto(null, "Este producto nunca llega a crearse");
    }
}
