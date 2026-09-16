public class Motor {
    private int cilindrada;
    private boolean encendido;

    public Motor(int cilindrada) {
        this.cilindrada = cilindrada;
        this.encendido = false;
    }

    public void arrancar() {
        encendido = true;
        System.out.println("Motor de " + cilindrada + "cc arrancado");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Motor de " + cilindrada + "cc apagado");
    }
}
