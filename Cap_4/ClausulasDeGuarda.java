public class ClausulasDeGuarda {
    public static void main(String[] args) {
        int[] plazasCasos = {0, 5, 3, -2};
        boolean[] confirmadaCasos = {true, false, true, true};

        for (int i = 0; i < plazasCasos.length; i++) {
            boolean original = esReservaValidaOriginal(plazasCasos[i], confirmadaCasos[i]);
            boolean guardas = esReservaValidaConGuardas(plazasCasos[i], confirmadaCasos[i]);
            System.out.println("plazas=" + plazasCasos[i] + ", confirmada=" + confirmadaCasos[i]
                    + " -> original=" + original + ", guardas=" + guardas);
        }
    }

    static boolean esReservaValidaOriginal(int plazas, boolean confirmada) {
        boolean valida = false;
        if (plazas > 0) {
            if (confirmada) {
                valida = true;
            }
        }
        return valida;
    }

    static boolean esReservaValidaConGuardas(int plazas, boolean confirmada) {
        if (plazas <= 0) {
            return false;
        }
        if (!confirmada) {
            return false;
        }
        return true;
    }

    // La versión con cláusulas de guarda resulta más fácil de leer: cada
    // condición de invalidez se resuelve de inmediato con un "return", sin
    // necesidad de anidar bloques "if" ni de rastrear el valor de una variable
    // auxiliar ("valida") a lo largo de todo el método.
}
