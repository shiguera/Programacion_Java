public class Coche {
    private Motor motor;

    public Coche(int cilindradaMotor) {
        this.motor = new Motor(cilindradaMotor);
    }

    public void arrancar() {
        motor.arrancar();
    }

    public void apagar() {
        motor.apagar();
    }
}
