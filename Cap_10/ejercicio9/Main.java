public class Main {
    public static void main(String[] args) {
        Serializable[] elementos = {
                new SensorTemperatura("S-01", "Sala A", 21.5),
                new SensorHumedad("S-02", "Sala B", 48.0)
        };

        for (Serializable s : elementos) {
            System.out.println(s.serializar());
        }
    }
}
