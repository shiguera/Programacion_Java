public class Main {
    public static void main(String[] args) {
        Sensor[] sensores = {
                new SensorTemperatura(),
                new SensorPresion()
        };

        for (Sensor s : sensores) {
            // Pattern matching con instanceof (Java 16+): la comprobación
            // de tipo y el downcasting se hacen en un único paso, y la
            // variable con el tipo ya convertido (st, sp) solo existe
            // dentro de la rama donde la comprobación es cierta.
            String unidad;
            if (s instanceof SensorTemperatura st) {
                unidad = st.getUnidad();
            } else if (s instanceof SensorPresion sp) {
                unidad = sp.getUnidad();
            } else {
                unidad = "unidad desconocida";
            }

            System.out.println(s.getClass().getSimpleName() + ": "
                    + s.leerValor() + " " + unidad);
        }
        // El resultado es idéntico al del Ejercicio 9.4. La diferencia es
        // de legibilidad: ya no hace falta declarar explícitamente la
        // variable convertida ni repetir el casting; el propio patrón
        // "instanceof SensorTemperatura st" declara y asigna st en un
        // solo paso, eliminando la redundancia entre la comprobación y
        // la conversión.
    }
}
