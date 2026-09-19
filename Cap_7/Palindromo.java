public class Palindromo {
    public static void main(String[] args) {
        String[] pruebas = {"Ana", "A man a plan a canal Panama", "Java"};
        for (String prueba : pruebas) {
            System.out.println("\"" + prueba + "\" es palíndromo: " + esPalindromo(prueba));
        }
    }

    static boolean esPalindromo(String s) {
        String normalizada = s.toLowerCase().replace(" ", "");
        String invertida = new StringBuilder(normalizada).reverse().toString();
        return normalizada.equals(invertida);
    }
}
