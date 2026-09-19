public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "1234-BCD", 180, 5);
        System.out.println(coche);

        // Resultado equivalente al del Ejercicio 8.1:
        // "Coche[marca=Toyota, matricula=1234-BCD, velocidadMaxima=180,
        // numeroPuertas=5]", solo que ahora la parte heredada (marca y
        // matricula) se obtiene reutilizando descripcionBase() en lugar de
        // acceder de nuevo a los getters heredados.
    }
}
