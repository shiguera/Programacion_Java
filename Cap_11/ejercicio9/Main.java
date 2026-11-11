public class Main {
    public static void main(String[] args) {
        try (BufferEscritura buffer = new BufferEscritura()) {
            buffer.escribir("Primera línea");
            buffer.escribir("Segunda línea");
            buffer.escribir("Tercera línea");
        }
        // close() se invoca automáticamente al salir del bloque try, sin
        // necesidad de un finally explícito.
        System.out.println("Fin del programa.");
    }
}
