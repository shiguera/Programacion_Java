public class Procesador {

    public static void procesarEntrada(String[] datos) {
        for (String dato : datos) {
            try {
                // dato.trim() se invoca antes de convertir, precisamente
                // para que un elemento null provoque un NullPointerException
                // real al intentar invocar un método sobre él. (En las
                // versiones recientes del JDK, Integer.parseInt(null) lanza
                // en realidad NumberFormatException y no NullPointerException,
                // así que si solo se llamara a Integer.parseInt(dato), el
                // caso null nunca llegaría a probar la rama NullPointerException
                // del multi-catch.)
                int numero = Integer.parseInt(dato.trim());
                System.out.println(dato + " -> raíz cuadrada = " + Math.sqrt(numero));
            } catch (NumberFormatException | NullPointerException e) {
                // Mismo tratamiento para ambos tipos de excepción: una
                // cadena no numérica (o vacía) lanza NumberFormatException,
                // y un elemento null lanza NullPointerException en dato.trim().
                System.out.println("No se pudo procesar \"" + dato + "\": " + e.getClass().getSimpleName());
            }
        }
    }
}
