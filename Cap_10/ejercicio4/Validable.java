public interface Validable {
    boolean esValido();

    default void validarEImprimir() {
        if (esValido()) {
            System.out.println(this + " -> válido");
        } else {
            System.out.println(this + " -> NO válido");
        }
    }
}
