public class Factura implements Exportable {
    private String numero;
    private double total;

    public Factura(String numero, double total) {
        this.numero = numero;
        this.total = total;
    }

    @Override
    public void exportar(String formato) {
        if (formato.equalsIgnoreCase("JSON")) {
            System.out.println("{\"numero\":\"" + numero + "\",\"total\":" + total + "}");
        } else if (formato.equalsIgnoreCase("CSV")) {
            System.out.println(numero + "," + total);
        } else {
            System.out.println("Formato no soportado: " + formato);
        }
    }
}
