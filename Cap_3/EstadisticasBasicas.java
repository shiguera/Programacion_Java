import java.util.Scanner;

public class EstadisticasBasicas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a introducir? ");
        int n = teclado.nextInt();

        double[] numeros = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
            suma += numeros[i];
        }

        double media = suma / n;

        double maximo = numeros[0];
        double minimo = numeros[0];
        int porEncimaDeLaMedia = 0;

        for (double valor : numeros) {
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
            if (valor > media) {
                porEncimaDeLaMedia++;
            }
        }

        System.out.printf("Media: %.2f%n", media);
        System.out.printf("Máximo: %.2f%n", maximo);
        System.out.printf("Mínimo: %.2f%n", minimo);
        System.out.println("Valores por encima de la media: " + porEncimaDeLaMedia);

        teclado.close();
    }
}
