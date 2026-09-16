public class Main {
    public static void main(String[] args) {
        Intervalo i1 = new Intervalo(2, 8);
        Intervalo i2 = new Intervalo(5, -1); // se intercambian internamente

        System.out.println("i1 = [" + i1.getInicio() + ", " + i1.getFin() + "], longitud = " + i1.longitud());
        System.out.println("i2 = [" + i2.getInicio() + ", " + i2.getFin() + "], longitud = " + i2.longitud());

        System.out.println("¿i1 contiene 5? " + i1.contiene(5));
        System.out.println("¿i1 contiene 10? " + i1.contiene(10));
        System.out.println("¿i2 contiene 0? " + i2.contiene(0));
    }
}
