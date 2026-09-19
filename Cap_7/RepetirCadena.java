public class RepetirCadena {
    public static void main(String[] args) {
        System.out.println(repetir("hola", 4));
        System.out.println("n = 0 -> \"" + repetir("hola", 0) + "\"");
        System.out.println("n = 1 -> \"" + repetir("hola", 1) + "\"");
    }

    static String repetir(String s, int n) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                resultado.append(", ");
            }
            resultado.append(s);
        }
        return resultado.toString();
    }
}
