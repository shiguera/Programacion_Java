public class InversionArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Array antes de invertir:");
        mostrarArray(numeros);

        int inicio = 0;
        int fin = numeros.length - 1;
        while (inicio < fin) {
            int aux = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = aux;
            inicio++;
            fin--;
        }

        System.out.println("Array después de invertir:");
        mostrarArray(numeros);
    }

    private static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
