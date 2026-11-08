public interface Plugin {
    void inicializar();

    void ejecutar();

    void detener();

    default String getNombre() {
        return this.getClass().getSimpleName();
    }
}
