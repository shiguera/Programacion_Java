public class Main {
    public static void main(String[] args) {
        String[] valores = { "42", "-17", "tres", "3.14", "" };

        for (String v : valores) {
            int resultado = Conversor.convertir(v);
            System.out.println("convertir(\"" + v + "\") = " + resultado);
        }
    }
}
