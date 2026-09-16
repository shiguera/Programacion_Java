public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.setSaldo(100.0);
        System.out.println("Saldo tras fijar 100.0: " + cuenta.getSaldo());

        cuenta.setSaldo(-50.0);
        System.out.println("Saldo tras intentar -50.0 (rechazado): " + cuenta.getSaldo());

        cuenta.setActiva(true);
        System.out.println("¿Cuenta activa? " + cuenta.isActiva());
    }
}
