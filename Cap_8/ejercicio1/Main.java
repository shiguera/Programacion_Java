public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Genérico", "0000-AAA", 120);
        Coche coche = new Coche("Toyota", "1234-BCD", 180, 5);

        System.out.println(vehiculo);
        System.out.println(coche);
    }
}
