import java.util.Objects;

public final class Switch extends Dispositivo {
    private int numeroPuertos;

    public Switch(String identificador, String direccionIp, String estado, int numeroPuertos) {
        super(identificador, direccionIp, estado);
        this.numeroPuertos = numeroPuertos;
    }

    public int getNumeroPuertos() {
        return numeroPuertos;
    }

    @Override
    public String toString() {
        return "Switch[" + super.toString() + ", numeroPuertos=" + numeroPuertos + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Switch otro = (Switch) obj;
        return numeroPuertos == otro.numeroPuertos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), numeroPuertos);
    }
}
