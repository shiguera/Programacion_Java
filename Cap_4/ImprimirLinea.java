public class ImprimirLinea {
    public static void main(String[] args) {
        imprimirLinea();
        imprimirLinea();
        imprimirLinea();
    }

    static void imprimirLinea() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
