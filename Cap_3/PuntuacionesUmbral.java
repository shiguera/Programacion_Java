import java.util.Scanner;

public class PuntuacionesUmbral {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántas puntuaciones vas a introducir? ");
        int n = teclado.nextInt();

        int[] puntuaciones = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la puntuación " + (i + 1) + ": ");
            puntuaciones[i] = teclado.nextInt();
        }

        System.out.print("Introduce el umbral: ");
        int umbral = teclado.nextInt();

        // Se usa long para evitar desbordamiento si hay muchos múltiplos de 10
        long producto = 1;
        int contadorUmbral = 0;

        for (int puntuacion : puntuaciones) {
            if (puntuacion % 10 == 0) {
                producto *= puntuacion;
            }
            if (puntuacion > umbral) {
                contadorUmbral++;
            }
        }

        System.out.println("Producto de las puntuaciones múltiplos de 10: " + producto);
        System.out.println("Puntuaciones por encima del umbral: " + contadorUmbral);

        teclado.close();
    }
}
