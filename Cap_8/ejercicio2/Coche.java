public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String matricula, int velocidadMaxima, int numeroPuertas) {
        super(marca, matricula, velocidadMaxima);
        System.out.println("Constructor de Coche");
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coche[marca=" + getMarca() + ", matricula=" + getMatricula()
                + ", velocidadMaxima=" + getVelocidadMaxima()
                + ", numeroPuertas=" + numeroPuertas + "]";
    }
}
