import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        teclado.close();
    }
}
