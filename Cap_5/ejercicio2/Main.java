public class Main {
    public static void main(String[] args) {
        Rectangulo porDefecto = new Rectangulo();
        Rectangulo cuadrado = new Rectangulo(5);
        Rectangulo rectangulo = new Rectangulo(3, 7);

        System.out.println("Por defecto -> área: " + porDefecto.area());
        System.out.println("Cuadrado (lado 5) -> área: " + cuadrado.area());
        System.out.println("Rectángulo (3 x 7) -> área: " + rectangulo.area());
    }
}
