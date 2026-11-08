public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Coche();

        // El resultado es "Vehículo genérico", NO "Coche".
        //
        // Explicación: los métodos static se resuelven mediante enlace
        // estático (en tiempo de compilación), mirando el TIPO DECLARADO
        // de la variable (Vehiculo), no el tipo real del objeto al que
        // apunta en tiempo de ejecución (Coche). No existe polimorfismo
        // para miembros static: Coche.tipoDeVehiculo() no sobrescribe a
        // Vehiculo.tipoDeVehiculo(), simplemente declara un método
        // independiente que oculta (hiding) al heredado, y solo es
        // visible al invocarlo a través del tipo declarado Coche o
        // directamente sobre el nombre de esa clase.
        System.out.println(v.tipoDeVehiculo());

        // Esto se ve con total claridad si se invoca sin pasar por
        // ninguna variable, directamente sobre cada clase:
        System.out.println(Vehiculo.tipoDeVehiculo()); // Vehículo genérico
        System.out.println(Coche.tipoDeVehiculo());    // Coche
    }
}
