import java.util.Scanner;

enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

public class ClasificadorDiaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un día de la semana (en mayúsculas, sin tildes): ");
        String entrada = teclado.next().toUpperCase();

        DiaSemana dia = DiaSemana.valueOf(entrada);

        switch (dia) {
            case SABADO, DOMINGO -> System.out.println("Es fin de semana");
            default -> System.out.println("Es un día laborable");
        }

        teclado.close();
    }
}
