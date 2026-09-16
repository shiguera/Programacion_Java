public class RangoA {
    public final int minimo;
    public final int maximo;

    public RangoA(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    // Es inmutable: los atributos son "final" y se asignan una única vez, en
    // el constructor. Sin embargo, NO proporciona abstracción: al ser
    // "public", cualquier código externo accede directamente a la
    // representación interna de la clase, sin pasar por ningún método;
    // cambiar esa representación en el futuro rompería a quien la use.
}
