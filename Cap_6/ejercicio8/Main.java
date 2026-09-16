public class Main {
    public static void main(String[] args) {
        Direccion direccionComun = new Direccion("Calle Mayor 1", "Madrid", "28013");

        Persona persona1 = new Persona("Ana", direccionComun);
        Persona persona2 = new Persona("Luis", direccionComun);

        System.out.println("Antes del cambio:");
        System.out.println(persona1.getNombre() + " -> " + persona1.getDireccion());
        System.out.println(persona2.getNombre() + " -> " + persona2.getDireccion());

        persona1.setDireccion(new Direccion("Avenida Sur 20", "Sevilla", "41001"));

        System.out.println("Después de cambiar la dirección de " + persona1.getNombre() + ":");
        System.out.println(persona1.getNombre() + " -> " + persona1.getDireccion());
        System.out.println(persona2.getNombre() + " -> " + persona2.getDireccion());

        // persona2 conserva la dirección original: el setter de persona1 hace
        // que su atributo "direccion" pase a apuntar a un objeto Direccion
        // nuevo, sin alterar el objeto que compartían ambas personas ni la
        // referencia que sigue teniendo persona2 hacia ese objeto original.
    }
}
