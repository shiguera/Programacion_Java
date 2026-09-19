import java.util.Random;

public class SimulacionDados {
    public static void main(String[] args) {
        Random random = new Random();
        int lanzamientos = 10000;
        int contadorSiete = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            if (dado1 + dado2 == 7) {
                contadorSiete++;
            }
        }

        double porcentaje = (contadorSiete * 100.0) / lanzamientos;

        System.out.println("Veces que la suma fue 7: " + contadorSiete + " de " + lanzamientos);
        System.out.printf("Porcentaje obtenido: %.2f%%%n", porcentaje);
        System.out.println("Probabilidad teórica: 16.67%");
    }
}
