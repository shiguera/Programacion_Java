public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Cuadrado(4.0),
                new Triangulo(6.0, 3.0),
                new Cuadrado(2.5),
                new Triangulo(10.0, 4.0)
        };

        // El bucle solo conoce el tipo Figura: no hay ninguna comprobación
        // de tipos (instanceof, getClass(), etc.). Cada objeto ejecuta su
        // propia versión de area() gracias al enlace dinámico.
        for (Figura f : figuras) {
            System.out.println(f.getClass().getSimpleName() + " -> área = " + f.area());
        }
    }
}
