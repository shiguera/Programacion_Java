public class EmpleadoFijo extends Empleado {
    private int antiguedad;

    public EmpleadoFijo(String nombre, double salario, int antiguedad) {
        super(nombre, salario);
        this.antiguedad = antiguedad;
    }

    public double calcularComplemento() {
        return antiguedad * 50;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Complemento: " + calcularComplemento());
    }
}
