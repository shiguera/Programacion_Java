import java.io.FileNotFoundException;
import java.io.FileReader;

public class GestorConfiguracion {

    public static void cargarConfiguracion(String ruta) throws ErrorCargaConfiguracionException {
        try {
            new FileReader(ruta);
            System.out.println("Configuración cargada desde " + ruta);
        } catch (FileNotFoundException e) {
            // Se envuelve la excepción de bajo nivel (propia de E/S) en una
            // excepción del dominio de la aplicación, conservando la causa
            // original mediante el segundo parámetro del constructor.
            throw new ErrorCargaConfiguracionException(
                    "No se pudo cargar la configuración desde " + ruta, e);
        }
    }
}
