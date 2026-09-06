public class Signo {
    public static void main(String[] args) {
        int[] valores = {5, -3, 0};
        for (int valor : valores) {
            System.out.println(valor + " -> " + signo(valor));
        }
    }

    static int signo(int numero) {
        if (numero > 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
