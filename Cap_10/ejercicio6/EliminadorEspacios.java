public class EliminadorEspacios implements Transformable {
    @Override
    public String transformar(String entrada) {
        StringBuilder sinEspacios = new StringBuilder();
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c != ' ') {
                sinEspacios.append(c);
            }
        }
        return sinEspacios.toString();
    }
}
