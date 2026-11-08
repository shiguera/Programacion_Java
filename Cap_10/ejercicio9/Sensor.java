public abstract class Sensor implements Serializable {
    protected String id;
    protected String ubicacion;

    public Sensor(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }

    // Sensor implementa Serializable pero deja serializar() sin cuerpo:
    // sigue siendo abstracto aquí, y cada subclase concreta debe
    // proporcionar su propia implementación.
    @Override
    public abstract String serializar();
}
