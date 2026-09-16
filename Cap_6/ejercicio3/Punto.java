public class Punto {
    // Atributos públicos, tal como se definen en el capítulo.
    public int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto otroPunto) {
        this.x = otroPunto.x;
        this.y = otroPunto.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
