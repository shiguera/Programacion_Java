public class ContratoMovil extends Contrato {
    private int gigas;
    private int minutosVoz;

    public ContratoMovil(String titular, double precioBase, int gigas, int minutosVoz) {
        super(titular, precioBase);
        this.gigas = gigas;
        this.minutosVoz = minutosVoz;
    }

    // Recargo inventado para este ejercicio (el enunciado no especifica
    // una fórmula concreta): 2 € por cada giga y 0,05 € por cada minuto
    // de voz incluidos en la tarifa.
    @Override
    public double getPrecioFinal() {
        return precioBase + (gigas * 2.0) + (minutosVoz * 0.05);
    }
}
