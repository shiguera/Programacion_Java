import java.io.IOException;

public class Main {

    static void nivel3() throws IOException {
        throw new IOException("Error simulado de entrada/salida");
    }

    static void nivel2() throws IOException {
        nivel3(); // no captura: se limita a propagar, por eso debe declarar throws
    }

    static void nivel1() {
        try {
            nivel2();
        } catch (IOException e) {
            System.out.println("Capturada en nivel1: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        nivel1();
        // La excepción lanzada en nivel3() atraviesa nivel2() (que no la
        // captura, solo la deja pasar declarándola con throws) y es
        // finalmente capturada en nivel1(), el primer nivel de la pila
        // que dispone de un bloque catch compatible.
    }
}
