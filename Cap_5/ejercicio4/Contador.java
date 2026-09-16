public class Contador {
    private static int total = 0;

    private int id;

    public Contador() {
        total++;
        id = total;
    }

    public int getId() {
        return id;
    }

    public static int getTotalContadores() {
        return total;
    }
}
