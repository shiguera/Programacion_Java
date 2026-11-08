public class InversorTexto implements Transformable {
    @Override
    public String transformar(String entrada) {
        // Inversión letra a letra, sin usar StringBuilder.reverse().
        StringBuilder invertido = new StringBuilder();
        for (int i = entrada.length() - 1; i >= 0; i--) {
            invertido.append(entrada.charAt(i));
        }
        return invertido.toString();
    }
}
