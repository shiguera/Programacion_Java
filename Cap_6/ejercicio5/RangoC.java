public class RangoC {
    private int minimo;
    private int maximo;

    public RangoC(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    // NO es inmutable: al no ser "final" y existir setters, los atributos se
    // pueden modificar después de crear el objeto. Sí proporciona
    // abstracción, igual que la versión (b), ya que el acceso pasa por
    // getters y setters en lugar de exponer los atributos directamente.
}
