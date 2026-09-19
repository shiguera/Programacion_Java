// Se declara "final" porque un DNI es un concepto cerrado: no tiene sentido
// que exista una subclase que amplíe o especialice su comportamiento, y
// hacerla final evita además que el algoritmo de validación del formato
// pueda alterarse mediante sobrescritura en una hipotética subclase.
public final class Dni {
    private String valor;

    public Dni(String valor) {
        if (esFormatoValido(valor)) {
            this.valor = valor;
        } else {
            this.valor = "INVALIDO";
        }
    }

    private static boolean esFormatoValido(String valor) {
        if (valor == null || valor.length() != 9) {
            return false;
        }
        String numeros = valor.substring(0, 8);
        char letra = valor.charAt(8);

        for (int i = 0; i < numeros.length(); i++) {
            if (!Character.isDigit(numeros.charAt(i))) {
                return false;
            }
        }
        return Character.isUpperCase(letra);
    }

    @Override
    public String toString() {
        return valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dni)) {
            return false;
        }
        Dni otro = (Dni) obj;
        return valor.equals(otro.valor);
    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }
}
