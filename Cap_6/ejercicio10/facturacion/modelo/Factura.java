package facturacion.modelo;

public class Factura {
    private String cliente;
    private LineaFactura[] lineas;
    private int numeroLineas;

    public Factura(String cliente, int capacidadMaxima) {
        this.cliente = cliente;
        this.lineas = new LineaFactura[capacidadMaxima];
        this.numeroLineas = 0;
    }

    public void agregarLinea(String concepto, int cantidad, double precioUnitario) {
        if (numeroLineas < lineas.length) {
            lineas[numeroLineas] = new LineaFactura(concepto, cantidad, precioUnitario);
            numeroLineas++;
        }
    }

    public void imprimir() {
        System.out.println("Factura de " + cliente + ":");
        double total = 0;
        for (int i = 0; i < numeroLineas; i++) {
            System.out.println("  " + lineas[i]);
            total += lineas[i].getImporte();
        }
        System.out.println("Total: " + total + " €");
    }
}
