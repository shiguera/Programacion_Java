public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Ana", 1000);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("Luis", 2000, 0.02);
        CuentaAhorroInfantil cuentaInfantil = new CuentaAhorroInfantil("Marta", 500, 0.01, 50);

        cuentaAhorro.aplicarInteres();
        boolean retiradaOk = cuentaInfantil.retirar(30);
        boolean retiradaExcesiva = cuentaInfantil.retirar(1000);

        System.out.println(cuenta);
        System.out.println(cuentaAhorro);
        System.out.println("Retirada de 30 permitida: " + retiradaOk);
        System.out.println("Retirada de 1000 permitida: " + retiradaExcesiva);
        System.out.println(cuentaInfantil);
    }
}
