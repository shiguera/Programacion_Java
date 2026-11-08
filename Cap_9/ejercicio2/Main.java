public class Main {
    public static void main(String[] args) {
        Sensor[] sensores = {
                new SensorTemperatura(),
                new SensorPresion(),
                new Sensor()
        };

        // Todas las variables del array son de tipo declarado Sensor. El
        // enlace dinámico selecciona, para cada objeto, la implementación
        // de leerValor() que corresponde a su tipo real.
        for (Sensor s : sensores) {
            s.mostrarLectura();
        }
    }
}
