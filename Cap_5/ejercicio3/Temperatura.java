public class Temperatura {
    private static final double CERO_ABSOLUTO = -273.15;

    private double valor;

    public Temperatura(double valor) {
        setValor(valor);
    }

    public void setValor(double valor) {
        if (valor >= CERO_ABSOLUTO) {
            this.valor = valor;
        }
        // Si el valor es inferior al cero absoluto, se rechaza y el atributo
        // queda sin modificar.
    }

    public double getValor() {
        return valor;
    }

    public double aFahrenheit() {
        return valor * 1.8 + 32;
    }
}
