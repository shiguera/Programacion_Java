public class Main {
    public static void main(String[] args) {
        Cuenta origen = new Cuenta(500);
        Cuenta destino = new Cuenta(100);

        transferir(origen, destino, 200);

        System.out.println("Saldo origen: " + origen.getSaldo());
        System.out.println("Saldo destino: " + destino.getSaldo());
    }

    static void transferir(Cuenta origen, Cuenta destino, double cantidad) {
        origen.retirar(cantidad);
        destino.ingresar(cantidad);
    }
}
