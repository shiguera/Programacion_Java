public class Main {
    public static void main(String[] args) {
        Punto valido = new Punto(3, 4);

        System.out.println("Distancia de " + valido + " al origen: " + distanciaAlOrigen(valido));
        System.out.println("Distancia de null al origen: " + distanciaAlOrigen(null));
    }

    static double distanciaAlOrigen(Punto p) {
        if (p == null) {
            return -1;
        }
        // Acceso directo a x e y, ya que son atributos públicos.
        return Math.sqrt(p.x * p.x + p.y * p.y);
    }
}
