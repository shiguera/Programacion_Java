public class Biblioteca {
    private static final int CAPACIDAD_MAXIMA = 100;

    private String nombre;
    private Libro[] libros;
    private int numeroLibros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[CAPACIDAD_MAXIMA];
        this.numeroLibros = 0;
    }

    public void anadirLibro(Libro libro) {
        if (numeroLibros < CAPACIDAD_MAXIMA) {
            libros[numeroLibros] = libro;
            numeroLibros++;
        } else {
            System.out.println("No se puede añadir el libro: la biblioteca ha alcanzado su capacidad máxima");
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        for (int i = 0; i < numeroLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return libros[i];
            }
        }
        return null;
    }

    public void imprimirCatalogo() {
        System.out.println("Catálogo de " + nombre + ":");
        for (int i = 0; i < numeroLibros; i++) {
            System.out.println("  " + libros[i]);
        }
    }
}
