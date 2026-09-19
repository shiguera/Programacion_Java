public class LineaAutobus {
    private int numeroLinea;
    private Autobus autobus;
    private Conductor conductor;

    // Agregación: autobus y conductor ya existen como objetos independientes
    // y se reciben ya construidos, en lugar de crearse aquí con "new".
    public LineaAutobus(int numeroLinea, Autobus autobus, Conductor conductor) {
        this.numeroLinea = numeroLinea;
        this.autobus = autobus;
        this.conductor = conductor;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public Conductor getConductor() {
        return conductor;
    }

    @Override
    public String toString() {
        return "Línea " + numeroLinea + " -> " + autobus + ", conducido por " + conductor;
    }
}
