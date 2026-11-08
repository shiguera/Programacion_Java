public final class FormaTriangular implements Forma {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public FormaTriangular(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double area() {
        // Fórmula de Herón.
        double s = perimetro() / 2.0;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }
}
