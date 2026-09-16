package facturacion.main;

import facturacion.modelo.Factura;

public class Main {
    public static void main(String[] args) {
        Factura f = new Factura("Cliente A", 10);
        f.agregarLinea("Producto 1", 3, 15.0);
        f.agregarLinea("Producto 2", 1, 42.5);
        f.imprimir();
    }
}
