public class SensorPresion extends Sensor {

    @Override
    public double leerValor() {
        return 1013.25; // valor simulado, en hectopascales
    }

    public String getUnidad() {
        return "hPa";
    }
}
