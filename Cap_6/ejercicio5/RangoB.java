public class RangoB {
    private final int minimo;
    private final int maximo;

    public RangoB(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    // Es inmutable, por el mismo motivo que la versión (a): los atributos son
    // "final" y no existen setters. A diferencia de (a), SÍ proporciona
    // abstracción: el acceso externo pasa siempre por los getters, así que la
    // representación interna podría cambiar en el futuro sin afectar al
    // código que usa la clase.
}
