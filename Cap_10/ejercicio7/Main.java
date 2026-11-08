public class Main {

    // Forma es una interfaz sellada con exactamente tres implementaciones
    // permitidas, todas ellas final: el compilador puede garantizar que
    // este switch es exhaustivo y no exige (ni permite plantearse) una
    // rama default. Si se comenta cualquiera de los tres "case", el
    // compilador rechaza la compilación por falta de exhaustividad.
    public static void describirForma(Forma f) {
        String descripcion = switch (f) {
            case FormaCircular c -> "Círculo -> área = " + c.area() + ", perímetro = " + c.perimetro();
            case FormaRectangular r -> "Rectángulo -> área = " + r.area() + ", perímetro = " + r.perimetro();
            case FormaTriangular t -> "Triángulo -> área = " + t.area() + ", perímetro = " + t.perimetro();
        };
        System.out.println(descripcion);
    }

    public static void main(String[] args) {
        Forma[] formas = {
                new FormaCircular(3.0),
                new FormaRectangular(4.0, 5.0),
                new FormaTriangular(3.0, 4.0, 5.0)
        };

        for (Forma f : formas) {
            describirForma(f);
        }
    }
}
