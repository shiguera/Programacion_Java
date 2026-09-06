import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        teclado.close();
    }
}
