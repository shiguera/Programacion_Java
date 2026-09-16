public class Main {
    public static void main(String[] args) {
        Segmento segmento1 = new Segmento(new Punto(0, 0), new Punto(3, 4));
        Segmento segmento2 = segmento1; // alias: misma referencia, no una copia

        // Punto.x es un atributo público (ver capítulo), por lo que se
        // modifica accediendo directamente a él, sin necesidad de un setter.
        segmento2.getOrigen().x = 99;

        System.out.println("segmento1: " + segmento1);
        System.out.println("segmento2: " + segmento2);

        // segmento1 y segmento2 apuntan al mismo objeto Segmento en memoria, y
        // ese objeto contiene a su vez una referencia al mismo objeto Punto
        // que actúa como origen. Modificar el punto a través de segmento2
        // modifica el único objeto Punto que existe, así que el cambio se ve
        // también al acceder a él desde segmento1: no hay dos segmentos
        // independientes, sino un único objeto con dos nombres (alias).
    }
}
