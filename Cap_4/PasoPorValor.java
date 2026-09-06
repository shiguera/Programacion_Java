public class PasoPorValor {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Antes: " + numero);
        incrementar(numero);
        System.out.println("Después: " + numero);

        // El valor de "numero" no cambia porque los tipos primitivos en Java se
        // pasan por valor: el método incrementar() recibe una copia del valor
        // de "numero", y la modificación dentro del método solo afecta a esa
        // copia local, no a la variable original de main().
    }

    static void incrementar(int valor) {
        valor += 10;
    }
}
