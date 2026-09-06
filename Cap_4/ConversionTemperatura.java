public class ConversionTemperatura {
    public static void main(String[] args) {
        double[] temperaturas = {0, 20, 37, 100};
        for (double celsius : temperaturas) {
            System.out.printf("%.1f°C = %.1f°F%n", celsius, celsiusAFahrenheit(celsius));
        }
    }

    /**
     * Convierte una temperatura expresada en grados Celsius a grados Fahrenheit.
     *
     * Requiere: ninguna restricción sobre el valor de entrada.
     * Modifica: nada (no tiene efectos secundarios).
     * Efectos: devuelve el valor equivalente en grados Fahrenheit, calculado
     * como celsius x 1.8 + 32.
     *
     * @param celsius temperatura en grados Celsius
     * @return la temperatura equivalente en grados Fahrenheit
     */
    static double celsiusAFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
