public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Pedro Gómez", "B-12345678");
        Autobus autobus = new Autobus("1234-XYZ", 60);

        LineaAutobus linea = new LineaAutobus(15, autobus, conductor);

        System.out.println(linea);
    }
}
