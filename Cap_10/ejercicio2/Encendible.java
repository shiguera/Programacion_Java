public interface Encendible {
    void encender();

    void apagar();

    // Una interfaz no puede guardar estado (no hay atributos de
    // instancia), así que el método default isEncendido() necesita
    // apoyarse en un método abstracto adicional que cada clase
    // implementadora debe definir para exponer su propio estado interno.
    boolean consultarEncendido();

    default boolean isEncendido() {
        return consultarEncendido();
    }
}
