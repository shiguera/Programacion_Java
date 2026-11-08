public class Main {
    public static void main(String[] args) {
        Validable[] elementos = {
                new DireccionEmail("ana.garcia@ejemplo.com"), // válido
                new DireccionEmail("ana.garcia-ejemplo.com"), // inválido: sin @
                new CodigoPostal("28031"),                    // válido
                new CodigoPostal("280"),                      // inválido: no tiene 5 dígitos
                new CodigoPostal("28A31")                     // inválido: no son todo dígitos
        };

        for (Validable v : elementos) {
            v.validarEImprimir();
        }
    }
}
