public class Main {
    public static void main(String[] args) {
        int[] valoresDePrueba = {0, 1, 5, 12, 20};
        for (int n : valoresDePrueba) {
            System.out.println(n + "^2 = " + TablaCuadrados.cuadrado(n));
        }
    }
}
