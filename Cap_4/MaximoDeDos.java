public class MaximoDeDos {
    public static void main(String[] args) {
        System.out.println(maximo(3, 7));
        System.out.println(maximo(10, 2));
        System.out.println(maximo(5, 5));
    }

    static int maximo(int a, int b) {
        return (a >= b) ? a : b;
    }
}
