public class FuncionPura {
    public static void main(String[] args) {
        double[] precios = {10.0, 25.5, 99.99};
        for (double precioSinIVA : precios) {
            double precioConIVA = calcularPrecioConIVA(precioSinIVA);
            mostrarPrecio(precioConIVA);
        }

        // a) El método original mostrarPrecioConIVA() no es una función pura:
        // además de calcular un valor, produce un efecto secundario (la
        // impresión por pantalla), lo que impide reutilizar el cálculo sin
        // repetir también la impresión.
    }

    /**
     * Función pura: calcula el precio con IVA a partir del precio sin IVA.
     */
    static double calcularPrecioConIVA(double precioSinIVA) {
        return precioSinIVA * 1.21;
    }

    /**
     * Acción: muestra por pantalla un precio ya calculado.
     */
    static void mostrarPrecio(double precio) {
        System.out.printf("Precio con IVA: %.2f%n", precio);
    }
}
