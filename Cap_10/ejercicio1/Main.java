public class Main {
    public static void main(String[] args) {
        // Producto, Empleado y Dispositivo no tienen ninguna relación de
        // herencia entre sí: lo único que comparten es que las tres
        // implementan la interfaz Describible.
        Describible[] elementos = {
                new Producto("Teclado mecánico", 59.90),
                new Empleado("Ana García", "Técnica de soporte"),
                new Dispositivo("RT-500", "RoutersCorp")
        };

        for (Describible d : elementos) {
            System.out.println(d.getDescripcion());
        }
    }
}
