public class Main {
    public static void main(String[] args) {
        double[] valores = { 0.0, 90.0, 359.99, 360.0, -15.0, 720.0 };

        for (double v : valores) {
            try {
                Angulo a = new Angulo(v);
                System.out.println("Ángulo creado correctamente: " + a);
            } catch (IllegalArgumentException e) {
                System.out.println("Error al crear el ángulo: " + e.getMessage());
            }
        }
    }
}
