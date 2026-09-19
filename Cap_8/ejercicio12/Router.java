import java.util.Objects;

public final class Router extends Dispositivo {
    private int numeroPuertosWan;

    public Router(String identificador, String direccionIp, String estado, int numeroPuertosWan) {
        super(identificador, direccionIp, estado);
        this.numeroPuertosWan = numeroPuertosWan;
    }

    public int getNumeroPuertosWan() {
        return numeroPuertosWan;
    }

    @Override
    public String toString() {
        return "Router[" + super.toString() + ", numeroPuertosWan=" + numeroPuertosWan + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Router otro = (Router) obj;
        return numeroPuertosWan == otro.numeroPuertosWan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), numeroPuertosWan);
    }
}
