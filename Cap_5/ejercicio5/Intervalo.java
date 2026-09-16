public class Intervalo {
    private final double inicio;
    private final double fin;

    public Intervalo(double a, double b) {
        if (a <= b) {
            this.inicio = a;
            this.fin = b;
        } else {
            this.inicio = b;
            this.fin = a;
        }
    }

    public double getInicio() {
        return inicio;
    }

    public double getFin() {
        return fin;
    }

    public double longitud() {
        return fin - inicio;
    }

    public boolean contiene(double x) {
        return x >= inicio && x <= fin;
    }
}
