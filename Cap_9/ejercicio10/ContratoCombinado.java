public class ContratoCombinado extends Contrato {
    private int gigas;
    private int minutosVoz;
    private int velocidadMbps;

    public ContratoCombinado(String titular, double precioBase, int gigas,
                              int minutosVoz, int velocidadMbps) {
        super(titular, precioBase);
        this.gigas = gigas;
        this.minutosVoz = minutosVoz;
        this.velocidadMbps = velocidadMbps;
    }

    // Recargo inventado para este ejercicio: se suman los mismos recargos
    // que en ContratoMovil y ContratoFibra, pero con un 10% de descuento
    // por agrupar ambos servicios en un único contrato.
    @Override
    public double getPrecioFinal() {
        double recargoMovil = (gigas * 2.0) + (minutosVoz * 0.05);
        double recargoFibra = velocidadMbps * 0.10;
        double recargoTotal = (recargoMovil + recargoFibra) * 0.90;
        return precioBase + recargoTotal;
    }
}
