public class Main {
    public static void main(String[] args) {
        for (TipoUsuario tipo : TipoUsuario.values()) {
            String limite = (tipo.getLimiteProyectos() == -1)
                    ? "sin límite"
                    : String.valueOf(tipo.getLimiteProyectos());
            System.out.println(tipo + " -> límite de proyectos: " + limite);
        }
    }
}
