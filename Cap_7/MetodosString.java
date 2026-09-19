import java.util.Scanner;

public class MetodosString {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = teclado.nextLine();

        System.out.println("Longitud: " + texto.length());
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
        System.out.println("¿Contiene \"Java\"?: " + texto.contains("Java"));
        System.out.println("Posición de la primera vocal: " + primeraVocal(texto));
        System.out.println("Con guiones bajos: " + texto.replace(' ', '_'));

        teclado.close();
    }

    private static int primeraVocal(String texto) {
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++) {
            if (vocales.indexOf(texto.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }
}
