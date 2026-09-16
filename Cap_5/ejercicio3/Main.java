public class Main {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(20.0);
        System.out.println("Valor inicial: " + temperatura.getValor());

        temperatura.setValor(-300.0);
        System.out.println("Tras intentar -300.0 (inválido): " + temperatura.getValor());

        temperatura.setValor(-273.15);
        System.out.println("Tras fijar el cero absoluto (válido): " + temperatura.getValor());

        System.out.printf("Equivalente en Fahrenheit: %.2f%n", temperatura.aFahrenheit());
    }
}
