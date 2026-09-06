import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de mes (1-12): ");
        int mes = teclado.nextInt();

        String dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 días";
            case 4, 6, 9, 11 -> "30 días";
            case 2 -> "28 o 29 días";
            default -> "Mes no válido";
        };

        System.out.println(dias);

        teclado.close();
    }
}
