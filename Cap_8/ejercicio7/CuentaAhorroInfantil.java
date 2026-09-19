public class CuentaAhorroInfantil extends CuentaAhorro {
    private double limiteRetirada;

    public CuentaAhorroInfantil(String titular, double saldo, double tipoInteres, double limiteRetirada) {
        super(titular, saldo, tipoInteres);
        this.limiteRetirada = limiteRetirada;
    }

    public double getLimiteRetirada() {
        return limiteRetirada;
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= limiteRetirada && cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaAhorroInfantil[titular=" + getTitular() + ", saldo=" + getSaldo()
                + ", tipoInteres=" + getTipoInteres() + ", limiteRetirada=" + limiteRetirada + "]";
    }
}
