import java.util.Objects;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ") - ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Libro)) {
            return false;
        }
        Libro otro = (Libro) obj;
        return isbn.equals(otro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
