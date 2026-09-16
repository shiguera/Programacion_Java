public enum TipoUsuario {
    BASICO(3),
    PREMIUM(10),
    ADMIN(-1);

    private final int limiteProyectos;

    TipoUsuario(int limiteProyectos) {
        this.limiteProyectos = limiteProyectos;
    }

    public int getLimiteProyectos() {
        return limiteProyectos;
    }
}
