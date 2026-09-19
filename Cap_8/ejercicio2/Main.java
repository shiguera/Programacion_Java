public class Main {
    public static void main(String[] args) {
        System.out.println("Creando un Camion:");
        Camion camion = new Camion("Volvo", "5678-EFG", 90, 12000.0);
        System.out.println(camion);

        // El orden de ejecución es: primero se ejecuta por completo el
        // constructor de Vehiculo (la superclase) y, solo cuando este
        // termina, se ejecuta el resto del constructor de Camion. Esto
        // ocurre porque toda subclase debe garantizar que la parte heredada
        // del objeto quede completamente inicializada antes de inicializar
        // sus propios atributos; por eso Java exige que la llamada a
        // super(...) sea la primera instrucción del constructor de la
        // subclase (explícita, como aquí, o implícita si se omite y existe
        // un constructor sin parámetros en la superclase).
    }
}
