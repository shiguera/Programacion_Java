import java.util.Arrays;

public class CopiaArrays {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        int[] copiaCompleta = Arrays.copyOf(original, original.length);
        int[] copiaParcial = Arrays.copyOfRange(original, 0, 3);

        copiaCompleta[0] = 999;

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copia completa (modificada): " + Arrays.toString(copiaCompleta));
        System.out.println("Copia parcial (3 primeros): " + Arrays.toString(copiaParcial));

        System.out.println("¿El original ha cambiado? " + !Arrays.equals(original, copiaCompleta));
        // Arrays.equals() compara los elementos de ambos arrays; al ser
        // distintos, se confirma que copiaCompleta es un array independiente
        // y que modificarlo no afecta a "original".
    }
}
