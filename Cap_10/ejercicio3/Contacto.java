public class Contacto implements Exportable {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public void exportar(String formato) {
        if (formato.equalsIgnoreCase("JSON")) {
            System.out.println("{\"nombre\":\"" + nombre + "\",\"telefono\":\"" + telefono + "\"}");
        } else if (formato.equalsIgnoreCase("CSV")) {
            System.out.println(nombre + "," + telefono);
        } else {
            System.out.println("Formato no soportado: " + formato);
        }
    }
}
