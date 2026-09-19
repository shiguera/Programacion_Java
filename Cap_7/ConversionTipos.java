import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            String texto = teclado.nextLine();
            numeros[i] = Double.parseDouble(texto);
        }

        double suma = 0;
        double maximo = numeros[0];
        double minimo = numeros[0];

        for (double numero : numeros) {
            suma += numero;
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
        }

        double media = suma / numeros.length;

        System.out.printf("Media: %.2f%n", media);
        System.out.printf("Máximo: %.2f%n", maximo);
        System.out.printf("Mínimo: %.2f%n", minimo);

        teclado.close();

        // Si se introduce un texto sin formato numérico válido (por ejemplo,
        // "abc"), Double.parseDouble() lanza una NumberFormatException que,
        // al no estar capturada, interrumpe el programa y muestra un mensaje
        // del tipo: "Exception in thread "main" java.lang.NumberFormatException:
        // For input string: "abc"".
    }
}
