public class TrianguloEquilatero extends FormaGeometrica {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4.0) * lado * lado;
    }

    @Override
    public double perimetro() {
        return 3 * lado;
    }

    @Override
    public String getNombre() {
        return "Triángulo equilátero";
    }
}
