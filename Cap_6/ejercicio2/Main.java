public class Main {
    public static void main(String[] args) {
        Punto original = new Punto(1, 1);
        Punto alias = original;             // asignación simple: mismo objeto
        Punto copia = new Punto(original);  // constructor de copia: objeto distinto

        // x e y son atributos públicos (ver capítulo), se modifican
        // directamente sin necesidad de setters.
        original.x = 50;
        original.y = 50;

        System.out.println("original: " + original);
        System.out.println("alias: " + alias);
        System.out.println("copia: " + copia);

        // "alias" refleja el cambio porque la asignación simple ("alias =
        // original") copia únicamente el valor de la referencia, no el
        // objeto: ambas variables terminan apuntando al mismo objeto Punto.
        // "copia", en cambio, se construyó con el constructor de copia, que
        // crea un objeto Punto completamente nuevo con los valores que tenía
        // "original" en ese momento; al no compartir memoria con "original",
        // las modificaciones posteriores no le afectan.
    }
}
