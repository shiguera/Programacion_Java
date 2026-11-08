public abstract class FormaGeometrica {

    public abstract double area();

    public abstract double perimetro();

    public abstract String getNombre();

    // Método plantilla (template method): define el formato común del
    // informe usando los métodos abstractos que cada subclase implementa
    // a su manera, sin necesidad de conocer de qué subclase se trata.
    public void descripcion() {
        System.out.printf("%s -> área = %.2f, perímetro = %.2f%n",
                getNombre(), area(), perimetro());
    }
}
