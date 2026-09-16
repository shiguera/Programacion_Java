public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4, 6);
        Rectangulo r2 = new Rectangulo(2.5, 3.5);

        System.out.println("Rectángulo 1 -> área: " + r1.area() + ", perímetro: " + r1.perimetro());
        System.out.println("Rectángulo 2 -> área: " + r2.area() + ", perímetro: " + r2.perimetro());
    }
}
