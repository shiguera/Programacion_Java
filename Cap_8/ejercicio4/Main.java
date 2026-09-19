public class Main {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(6, 3);

        cuadrado.descripcion();
        triangulo.descripcion();
    }
}
