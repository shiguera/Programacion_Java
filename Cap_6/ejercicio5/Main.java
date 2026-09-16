public class Main {
    public static void main(String[] args) {
        RangoA a = new RangoA(1, 10);
        System.out.println("RangoA: [" + a.minimo + ", " + a.maximo + "]");

        RangoB b = new RangoB(1, 10);
        System.out.println("RangoB: [" + b.getMinimo() + ", " + b.getMaximo() + "]");

        RangoC c = new RangoC(1, 10);
        c.setMinimo(0);
        System.out.println("RangoC tras modificar el mínimo: [" + c.getMinimo() + ", " + c.getMaximo() + "]");
    }
}
