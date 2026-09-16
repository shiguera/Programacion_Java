public class Informe {
    public void mostrarOperaciones(double a, double b) {
        System.out.println(a + " + " + b + " = " + Calculadora.sumar(a, b));
        System.out.println(a + " - " + b + " = " + Calculadora.restar(a, b));
        System.out.println(a + " x " + b + " = " + Calculadora.multiplicar(a, b));
        System.out.println(a + " / " + b + " = " + Calculadora.dividir(a, b));
    }
}
