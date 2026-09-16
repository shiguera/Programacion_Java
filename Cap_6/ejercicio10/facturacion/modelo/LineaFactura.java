package facturacion.modelo;

public class LineaFactura {
    private String concepto;
    private int cantidad;
    private double precioUnitario;

    public LineaFactura(String concepto, int cantidad, double precioUnitario) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double getImporte() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return concepto + " x" + cantidad + " -> " + getImporte() + " €";
    }
}
