public class ContratoFibra extends Contrato {
    private int velocidadMbps;

    public ContratoFibra(String titular, double precioBase, int velocidadMbps) {
        super(titular, precioBase);
        this.velocidadMbps = velocidadMbps;
    }

    // Recargo inventado para este ejercicio: 0,10 € por cada Mbps de
    // velocidad contratada.
    @Override
    public double getPrecioFinal() {
        return precioBase + (velocidadMbps * 0.10);
    }
}
