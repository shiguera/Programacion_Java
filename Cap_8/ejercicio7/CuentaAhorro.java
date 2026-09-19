public class CuentaAhorro extends Cuenta {
    private double tipoInteres;

    public CuentaAhorro(String titular, double saldo, double tipoInteres) {
        super(titular, saldo);
        this.tipoInteres = tipoInteres;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void aplicarInteres() {
        double nuevoSaldo = getSaldo() * (1 + tipoInteres);
        setSaldo(nuevoSaldo);
    }

    @Override
    public String toString() {
        return "CuentaAhorro[titular=" + getTitular() + ", saldo=" + getSaldo()
                + ", tipoInteres=" + tipoInteres + "]";
    }
}
