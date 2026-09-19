public class Autoboxing {
    public static void main(String[] args) {
        Integer a1 = 100;
        Integer a2 = 100;
        System.out.println("100 == 100 (Integer): " + (a1 == a2) + ", equals: " + a1.equals(a2));

        Integer b1 = 127;
        Integer b2 = 127;
        System.out.println("127 == 127 (Integer): " + (b1 == b2) + ", equals: " + b1.equals(b2));

        Integer c1 = 128;
        Integer c2 = 128;
        System.out.println("128 == 128 (Integer): " + (c1 == c2) + ", equals: " + c1.equals(c2));

        Integer d1 = 200;
        Integer d2 = 200;
        System.out.println("200 == 200 (Integer): " + (d1 == d2) + ", equals: " + d1.equals(d2));

        // Java mantiene en caché los objetos Integer para los valores entre
        // -128 y 127 (el autoboxing usa internamente Integer.valueOf(), que
        // reutiliza siempre la misma instancia dentro de ese rango). Por eso,
        // para 100 y 127 (dentro del caché), "==" da true: ambas variables
        // apuntan al mismo objeto. Para 128 y 200 (fuera del rango del
        // caché), cada autoboxing crea un objeto Integer nuevo, así que "=="
        // da false, aunque equals() siga devolviendo true en todos los casos,
        // ya que compara el valor numérico y no la referencia.
    }
}
