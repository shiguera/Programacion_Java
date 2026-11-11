public class Divisor {

    public static Integer dividir(String a, String b) {
        try {
            int numerador = Integer.parseInt(a);
            int denominador = Integer.parseInt(b);
            return numerador / denominador;
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
        return null; // ninguna de las dos divisiones pudo completarse
    }
}
