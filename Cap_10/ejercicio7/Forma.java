public sealed interface Forma permits FormaCircular, FormaRectangular, FormaTriangular {
    double area();

    double perimetro();
}
