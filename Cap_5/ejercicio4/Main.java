public class Main {
    public static void main(String[] args) {
        Contador[] contadores = new Contador[5];
        for (int i = 0; i < contadores.length; i++) {
            contadores[i] = new Contador();
        }

        for (Contador contador : contadores) {
            System.out.println("id = " + contador.getId());
        }

        System.out.println("Total de contadores creados: " + Contador.getTotalContadores());
    }
}
