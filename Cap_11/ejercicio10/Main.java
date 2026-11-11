public class Main {
    public static void main(String[] args) {
        try {
            GestorConfiguracion.cargarConfiguracion("/ruta/que/no/existe.properties");
        } catch (ErrorCargaConfiguracionException e) {
            System.out.println("Mensaje de la excepción de alto nivel: " + e.getMessage());
            System.out.println("Mensaje de la causa original: " + e.getCause().getMessage());
        }
    }
}
