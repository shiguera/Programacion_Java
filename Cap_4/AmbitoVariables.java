public class AmbitoVariables {
    public static void main(String[] args) {
        System.out.println("Resultado de metodoA(): " + metodoA());
        System.out.println("Resultado de metodoB(): " + metodoB());

        // No hay conflicto entre las dos variables "contador" porque cada una es
        // una variable local: su ámbito (scope) está limitado al cuerpo del
        // método donde se declara, y deja de existir en cuanto el método
        // termina. metodoA() y metodoB() no comparten memoria entre sí.
    }

    static int metodoA() {
        int contador = 1;
        return contador;
    }

    static int metodoB() {
        int contador = 100;
        return contador;
    }
}
