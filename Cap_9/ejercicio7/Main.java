public class Main {

    // Usa getClass(): distingue el tipo EXACTO del objeto, excluyendo
    // subclases. Un Directivo (que es subclase de EmpleadoFijo) NO se
    // clasifica aquí como EmpleadoFijo.
    public static void clasificar(Empleado e) {
        if (e.getClass() == EmpleadoFijo.class) {
            System.out.println("clasificar (getClass): es exactamente un EmpleadoFijo");
        } else {
            System.out.println("clasificar (getClass): NO es exactamente un EmpleadoFijo"
                    + " (tipo real: " + e.getClass().getSimpleName() + ")");
        }
    }

    // Usa instanceof: comprueba compatibilidad con el tipo, incluyendo
    // subclases. Un Directivo SÍ es un EmpleadoFijo según instanceof,
    // porque "es un" EmpleadoFijo por herencia.
    public static void clasificarConInstanceof(Empleado e) {
        if (e instanceof EmpleadoFijo) {
            System.out.println("clasificarConInstanceof: SÍ es un EmpleadoFijo"
                    + " (tipo real: " + e.getClass().getSimpleName() + ")");
        } else {
            System.out.println("clasificarConInstanceof: NO es un EmpleadoFijo");
        }
    }

    public static void main(String[] args) {
        Empleado directivo = new Directivo("Carmen Ruiz", 2300.0, 8, 24);

        clasificar(directivo);                // NO es exactamente un EmpleadoFijo
        clasificarConInstanceof(directivo);    // SÍ es un EmpleadoFijo

        // La diferencia confirma la teoría: getClass() identifica el tipo
        // concreto con precisión absoluta (Directivo != EmpleadoFijo),
        // mientras que instanceof comprueba compatibilidad respetando el
        // principio de sustitución de Liskov (un Directivo puede tratarse
        // como un EmpleadoFijo en cualquier contexto).
    }
}
