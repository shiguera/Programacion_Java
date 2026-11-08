public class Main {

    public static void exportarTodos(Exportable[] elementos, String formato) {
        for (Exportable e : elementos) {
            // El tipo declarado del parámetro del bucle es Exportable:
            // el enlace dinámico selecciona la implementación de
            // exportar() correspondiente al tipo real de cada objeto
            // (Contacto o Factura) sin ninguna comprobación de tipos aquí.
            e.exportar(formato);
        }
    }

    public static void main(String[] args) {
        Exportable[] elementos = {
                new Contacto("Ana García", "600111222"),
                new Factura("F-2026-001", 149.90)
        };

        System.out.println("--- Exportación a JSON ---");
        exportarTodos(elementos, "JSON");

        System.out.println("--- Exportación a CSV ---");
        exportarTodos(elementos, "CSV");
    }
}
