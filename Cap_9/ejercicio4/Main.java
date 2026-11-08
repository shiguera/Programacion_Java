public class Main {
    public static void main(String[] args) {
        Sensor[] sensores = {
                new SensorTemperatura(),
                new SensorPresion()
        };

        for (Sensor s : sensores) {
            // getUnidad() no está declarado en Sensor, así que no es
            // accesible a través de una referencia de ese tipo: hace falta
            // downcasting al tipo concreto. Comprobamos antes con
            // instanceof para no arriesgarnos a una ClassCastException.
            String unidad;
            if (s instanceof SensorTemperatura) {
                SensorTemperatura st = (SensorTemperatura) s;
                unidad = st.getUnidad();
            } else if (s instanceof SensorPresion) {
                SensorPresion sp = (SensorPresion) s;
                unidad = sp.getUnidad();
            } else {
                unidad = "unidad desconocida";
            }

            System.out.println(s.getClass().getSimpleName() + ": "
                    + s.leerValor() + " " + unidad);
        }
        // Ningún downcasting se ejecuta sin que el instanceof correspondiente
        // haya devuelto antes true, así que nunca se produce ClassCastException.
    }
}
