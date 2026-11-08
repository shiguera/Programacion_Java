public class CodigoPostal implements Validable {
    private String valor;

    public CodigoPostal(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean esValido() {
        return valor != null && valor.matches("\\d{5}");
    }

    @Override
    public String toString() {
        return "CodigoPostal(" + valor + ")";
    }
}
