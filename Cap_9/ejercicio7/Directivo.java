public class Directivo extends EmpleadoFijo {
    private int numEmpleadosACargo;

    public Directivo(String nombre, double salario, int antiguedad, int numEmpleadosACargo) {
        super(nombre, salario, antiguedad);
        this.numEmpleadosACargo = numEmpleadosACargo;
    }

    public int getNumEmpleadosACargo() {
        return numEmpleadosACargo;
    }

    // No sobrescribe imprimirFicha(): hereda la versión de EmpleadoFijo,
    // tal como se explica en el propio capítulo.
}
