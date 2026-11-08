public class ConversorMayusculas implements Transformable {
    @Override
    public String transformar(String entrada) {
        return entrada.toUpperCase();
    }
}
