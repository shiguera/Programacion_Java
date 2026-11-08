public class DireccionEmail implements Validable {
    private String valor;

    public DireccionEmail(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean esValido() {
        return valor != null && valor.contains("@");
    }

    @Override
    public String toString() {
        return "DireccionEmail(" + valor + ")";
    }
}
