public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // protected: solo las subclases necesitan modificar el saldo (por
    // ejemplo, al aplicar intereses o al retirar dinero); el resto del
    // código externo debe operar a través de métodos de más alto nivel.
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta[titular=" + titular + ", saldo=" + saldo + "]";
    }
}
