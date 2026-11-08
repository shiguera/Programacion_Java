public class SensorTemperatura extends Sensor {
    private double temperatura;

    public SensorTemperatura(String id, String ubicacion, double temperatura) {
        super(id, ubicacion);
        this.temperatura = temperatura;
    }

    @Override
    public String serializar() {
        return "SensorTemperatura{id=" + id + ", ubicacion=" + ubicacion
                + ", temperatura=" + temperatura + "}";
    }
}
