import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        // Nota: nextDouble() depende del locale del sistema para el separador decimal
        double radio = teclado.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        teclado.close();
    }
}
