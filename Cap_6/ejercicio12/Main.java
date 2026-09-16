public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.anadirLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605));
        biblioteca.anadirLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.anadirLibro(new Libro("1984", "George Orwell", 1949));

        biblioteca.imprimirCatalogo();

        Libro encontrado = biblioteca.buscarPorTitulo("1984");
        System.out.println("Buscando '1984': " + encontrado);

        Libro noEncontrado = biblioteca.buscarPorTitulo("Don Quijote de la Mancha");
        System.out.println("Buscando 'Don Quijote de la Mancha': " + noEncontrado);
    }
}
