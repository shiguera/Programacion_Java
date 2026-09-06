import java.util.Scanner;

public class AcumulacionSinArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int cantidad = 0;
        int maximo = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros (introduce -1 para terminar):");
        int numero = teclado.nextInt();

        while (numero != -1) {
            suma += numero;
            cantidad++;
            if (numero > maximo) {
                maximo = numero;
            }
            numero = teclado.nextInt();
        }

        if (cantidad > 0) {
            double media = (double) suma / cantidad;
            System.out.println("Suma: " + suma);
            System.out.printf("Media: %.2f%n", media);
            System.out.println("Máximo: " + maximo);
        } else {
            System.out.println("No se ha introducido ningún valor");
        }

        teclado.close();
    }
}
