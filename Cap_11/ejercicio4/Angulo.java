public class Angulo {
    private double grados;

    public Angulo(double grados) {
        if (grados < 0 || grados >= 360) {
            throw new IllegalArgumentException(
                    "El ángulo debe estar en el rango [0, 360), valor recibido: " + grados);
        }
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    @Override
    public String toString() {
        return grados + "°";
    }
}
