public class Camion extends Vehiculo {
    private double cargaMaxima;

    public Camion(String marca, String matricula, int velocidadMaxima, double cargaMaxima) {
        super(marca, matricula, velocidadMaxima);
        System.out.println("Constructor de Camion");
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public String toString() {
        return "Camion[marca=" + getMarca() + ", matricula=" + getMatricula()
                + ", velocidadMaxima=" + getVelocidadMaxima()
                + ", cargaMaxima=" + cargaMaxima + "]";
    }
}
