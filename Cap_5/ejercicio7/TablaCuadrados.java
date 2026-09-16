public class TablaCuadrados {
    private static final int[] CUADRADOS = new int[21];

    static {
        for (int i = 0; i <= 20; i++) {
            CUADRADOS[i] = i * i;
        }
    }

    public static int cuadrado(int n) {
        return CUADRADOS[n];
    }
}
