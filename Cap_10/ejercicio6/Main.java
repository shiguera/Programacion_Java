public class Main {
    public static void main(String[] args) {
        Transformable[] transformadores = {
                new ConversorMayusculas(),
                new InversorTexto(),
                new EliminadorEspacios()
        };

        String entrada = "Hola mundo";
        for (Transformable t : transformadores) {
            System.out.println(t.getClass().getSimpleName() + ": \""
                    + t.transformar(entrada) + "\"");
        }
    }
}
