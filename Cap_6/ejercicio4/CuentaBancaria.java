public class CuentaBancaria {
    private double saldo;
    private boolean activa;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    // El getter de un atributo boolean sigue la convención "isNombre()", no
    // "getNombre()", según la convención JavaBeans.
    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
