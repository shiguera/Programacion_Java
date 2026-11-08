public class Main {
    public static void main(String[] args) {
        Plugin[] plugins = {
                new MonitorAnchoBanda(100.0),
                new DetectorDispositivos(),
                new GeneradorInformes(30)
        };

        GestorPlugins gestor = new GestorPlugins(plugins);

        gestor.inicializarTodos();
        gestor.ejecutarTodos();
        gestor.detenerTodos();
    }
}
