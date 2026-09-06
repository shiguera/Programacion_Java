import java.util.Scanner;

public class MatrizIdentidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz: ");
        int n = teclado.nextInt();

        int[][] matriz = new int[n][n];

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                matriz[fila][columna] = (fila == columna) ? 1 : 0;
            }
        }

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
