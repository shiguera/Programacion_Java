import java.util.Scanner;

public class MaximoArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int maximo = numeros[0];
        int posicion = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicion = i;
            }
        }

        System.out.println("El valor máximo es " + maximo + " y se encuentra en la posición " + posicion);

        teclado.close();
    }
}
