public class Main {
    public static void main(String[] args) {
        LuzInteligente luz = new LuzInteligente();

        System.out.println("¿Encendida? " + luz.isEncendido()); // false

        luz.encender();
        System.out.println("¿Encendida? " + luz.isEncendido()); // true

        luz.subirIntensidad();
        luz.subirIntensidad();
        luz.bajarIntensidad();

        luz.apagar();
        System.out.println("¿Encendida? " + luz.isEncendido()); // false
    }
}
