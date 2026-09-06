public class ImprimirNVeces {
    public static void main(String[] args) {
        imprimirNVeces("Hola", 3);
        imprimirNVeces("Java", 5);
    }

    static void imprimirNVeces(String texto, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(texto);
        }
    }
}
