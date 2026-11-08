public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
                new Circulo(3.0),
                new Rectangulo(4.0, 5.0),
                new TrianguloEquilatero(6.0)
        };

        for (FormaGeometrica f : formas) {
            f.descripcion();
        }
    }
}
