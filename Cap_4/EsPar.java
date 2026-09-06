public class EsPar {
    public static void main(String[] args) {
        int[] valores = {0, 1, 4, 7, 100};
        for (int valor : valores) {
            System.out.println(valor + " -> " + esPar(valor));
        }
    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
