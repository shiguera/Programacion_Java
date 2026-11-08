public class GestorPlugins {
    private Plugin[] plugins;

    public GestorPlugins(Plugin[] plugins) {
        this.plugins = plugins;
    }

    public void inicializarTodos() {
        for (Plugin p : plugins) {
            p.inicializar();
        }
    }

    public void ejecutarTodos() {
        for (Plugin p : plugins) {
            p.ejecutar();
        }
    }

    public void detenerTodos() {
        for (Plugin p : plugins) {
            p.detener();
        }
    }
}
