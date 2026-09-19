public class Vehiculo {
    private String marca;
    private String matricula;
    private int velocidadMaxima;

    public Vehiculo(String marca, String matricula, int velocidadMaxima) {
        this.marca = marca;
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected String descripcionBase() {
        return "marca=" + marca + ", matricula=" + matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo[" + descripcionBase() + ", velocidadMaxima=" + velocidadMaxima + "]";
    }
}
