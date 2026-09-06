public class NumeroPrimo {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Determina si un número entero es primo.
     *
     * Requiere: ninguna restricción formal, aunque el método está pensado para
     * números positivos; para valores menores que 2 se devuelve directamente
     * false, ya que ni 0, ni 1, ni los negativos se consideran primos.
     * Modifica: nada (no tiene efectos secundarios).
     * Efectos: devuelve true si numero es primo, false en caso contrario.
     *
     * @param numero número entero a comprobar
     * @return true si numero es primo, false en caso contrario
     */
    static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
