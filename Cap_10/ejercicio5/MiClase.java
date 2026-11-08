public class MiClase implements InterfazA, InterfazB {

    // MiClase implementa dos interfaces que declaran un método default con
    // el mismo nombre y firma (saludar()). El compilador no puede elegir
    // una de las dos versiones automáticamente y obliga a sobrescribir el
    // método en la propia clase para resolver el conflicto explícitamente.
    @Override
    public void saludar() {
        InterfazA.super.saludar();
        InterfazB.super.saludar();
    }
}
