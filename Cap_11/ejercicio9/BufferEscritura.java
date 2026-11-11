import java.util.ArrayList;
import java.util.List;

public class BufferEscritura implements AutoCloseable {
    private final List<String> contenido = new ArrayList<>();

    public BufferEscritura() {
        System.out.println("Buffer de escritura abierto.");
    }

    public void escribir(String datos) {
        contenido.add(datos);
        System.out.println("Escrito en el buffer: " + datos);
    }

    @Override
    public void close() {
        System.out.println("Vaciando buffer. Contenido final:");
        for (String linea : contenido) {
            System.out.println("  " + linea);
        }
        contenido.clear();
    }
}
