public class InversionCadena {
    public static void main(String[] args) {
        String[] pruebas = {"Java", "", "reconocer"};
        for (String prueba : pruebas) {
            System.out.println("\"" + prueba + "\" invertida -> \"" + invertir(prueba) + "\"");
        }
    }

    static String invertir(String s) {
        StringBuilder resultado = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            resultado.append(s.charAt(i));
        }
        return resultado.toString();
    }
}
