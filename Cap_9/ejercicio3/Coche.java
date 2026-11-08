public class Coche extends Vehiculo {

    // No se puede anotar con @Override: un método static nunca sobrescribe,
    // solo oculta al de la superclase. Si se descomenta la línea @Override
    // de abajo, el compilador rechaza el código con un error como:
    //
    //   error: method does not override or implement a method from a
    //   supertype (los métodos static no participan del enlace dinámico,
    //   así que @Override no tiene sentido aplicado a ellos).
    //
    // @Override
    public static String tipoDeVehiculo() {
        return "Coche";
    }
}
