import java.util.Scanner;

public class NumeroCifras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = teclado.nextInt();

        int cifras = 0;
        int resto = numero;
        do {
            resto /= 10;
            cifras++;
        } while (resto != 0);

        System.out.println("El número tiene " + cifras + " cifra(s)");

        teclado.close();
    }
}
