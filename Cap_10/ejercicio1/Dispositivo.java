public class Dispositivo implements Describible {
    private String modelo;
    private String fabricante;

    public Dispositivo(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    @Override
    public String getDescripcion() {
        return "Dispositivo: " + modelo + " de " + fabricante;
    }
}
