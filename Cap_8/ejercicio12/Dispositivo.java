// Se declara "sealed" porque el diseño representa un conjunto cerrado y
// conocido de tipos de dispositivo (Router y Switch): esto permite, por
// ejemplo, que un futuro "switch" sobre Dispositivo pueda comprobarse de
// forma exhaustiva por el compilador sin necesidad de una rama "default".
public abstract sealed class Dispositivo permits Router, Switch {
    private String identificador;
    private String direccionIp;
    private String estado;

    public Dispositivo(String identificador, String direccionIp, String estado) {
        this.identificador = identificador;
        this.direccionIp = direccionIp;
        this.estado = estado;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "identificador=" + identificador + ", direccionIp=" + direccionIp + ", estado=" + estado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dispositivo otro = (Dispositivo) obj;
        return identificador.equals(otro.identificador);
    }

    @Override
    public int hashCode() {
        return identificador.hashCode();
    }
}
