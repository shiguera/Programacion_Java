import java.util.Arrays;

public class OrdenacionBusqueda {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 78, 3, 56, 89, 21, 67, 9, 34};

        System.out.println("Antes de ordenar: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Después de ordenar: " + Arrays.toString(numeros));

        int indiceExistente = Arrays.binarySearch(numeros, 56);
        int indiceInexistente = Arrays.binarySearch(numeros, 100);
        int indiceMaximo = Arrays.binarySearch(numeros, 89);

        System.out.println("Índice de 56 (existe): " + indiceExistente);
        System.out.println("Índice de 100 (no existe): " + indiceInexistente);
        System.out.println("Índice de 89 (máximo): " + indiceMaximo);

        // Cuando el valor buscado no está en el array, Arrays.binarySearch()
        // devuelve un número negativo, concretamente -(punto de inserción) -
        // 1, donde "punto de inserción" es la posición en la que habría que
        // insertar el valor para mantener el array ordenado.
    }
}
