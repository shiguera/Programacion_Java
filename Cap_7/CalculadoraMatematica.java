public class CalculadoraMatematica {
    public static void main(String[] args) {
        double radio = 7;
        double areaEsfera = 4 * Math.PI * radio * radio;
        double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        double cateto1 = 8;
        double cateto2 = 15;
        double hipotenusa = Math.hypot(cateto1, cateto2);

        double anguloRadianes = Math.toRadians(30);
        double seno = Math.sin(anguloRadianes);
        double coseno = Math.cos(anguloRadianes);

        double logNatural = Math.log(100);
        double logDecimal = Math.log10(100);

        System.out.printf("Área de la esfera (radio 7): %.4f%n", areaEsfera);
        System.out.printf("Volumen de la esfera (radio 7): %.4f%n", volumenEsfera);
        System.out.printf("Hipotenusa (catetos 8 y 15): %.4f%n", hipotenusa);
        System.out.printf("Seno de 30 grados: %.4f%n", seno);
        System.out.printf("Coseno de 30 grados: %.4f%n", coseno);
        System.out.printf("Logaritmo natural de 100: %.4f%n", logNatural);
        System.out.printf("Logaritmo decimal de 100: %.4f%n", logDecimal);
    }
}
