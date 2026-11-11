public class Conversor {

    public static int convertir(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + s + "\" no es un número entero válido");
            return 0;
        }
    }
}
