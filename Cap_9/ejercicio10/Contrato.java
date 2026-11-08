public abstract class Contrato {
    protected String titular;
    protected double precioBase;

    public Contrato(String titular, double precioBase) {
        this.titular = titular;
        this.precioBase = precioBase;
    }

    public abstract double getPrecioFinal();

    // Método plantilla (template method): el formato del resumen es
    // siempre el mismo, pero el precio final lo calcula cada subclase
    // con su propia lógica de recargos.
    public void imprimirResumen() {
        System.out.printf("Titular: %s | Precio base: %.2f € | Precio final: %.2f €%n",
                titular, precioBase, getPrecioFinal());
    }
}
