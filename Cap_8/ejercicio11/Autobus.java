public class Autobus {
    private String matricula;
    private int capacidad;

    public Autobus(String matricula, int capacidad) {
        this.matricula = matricula;
        this.capacidad = capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Autobús " + matricula + " (capacidad " + capacidad + ")";
    }
}
