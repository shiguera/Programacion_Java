public class Main {
    public static void main(String[] args) {
        System.out.println("--- División correcta ---");
        System.out.println(Divisor.dividir("10", "2"));

        System.out.println("--- Formato inválido ---");
        System.out.println(Divisor.dividir("diez", "2"));

        System.out.println("--- División por cero ---");
        System.out.println(Divisor.dividir("10", "0"));
    }
}
