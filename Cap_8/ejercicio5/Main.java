public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("978-84-376-0494-7", "El Quijote", "Cervantes");
        Libro libro2 = new Libro("978-84-376-0494-7", "El Quijote", "Cervantes");

        System.out.println("libro1: " + libro1);
        System.out.println("libro2: " + libro2);
        System.out.println("libro1.equals(libro2): " + libro1.equals(libro2));
        System.out.println("libro1 == libro2: " + (libro1 == libro2));
    }
}
