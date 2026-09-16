public class Segmento {
    // Agregación tal como se define en el capítulo: origen y destino ya
    // existen como objetos Punto independientes y se reciben ya construidos
    // en el constructor, sin copiarlos.
    private Punto origen;
    private Punto destino;

    public Segmento(Punto origen, Punto destino) {
        this.origen = origen; // se guarda la referencia recibida
        this.destino = destino;
    }

    public Punto getOrigen() {
        return origen;
    }

    public Punto getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Segmento[" + origen + " -> " + destino + "]";
    }
}
