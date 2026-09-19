import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculosFinancieros {
    public static void main(String[] args) {
        BigDecimal precio1 = new BigDecimal("19.99");
        BigDecimal precio2 = new BigDecimal("5.50");
        BigDecimal precio3 = new BigDecimal("12.30");

        BigDecimal total = precio1.add(precio2).add(precio3);

        BigDecimal descuento = new BigDecimal("0.10");
        BigDecimal totalConDescuento = total.multiply(BigDecimal.ONE.subtract(descuento));

        System.out.println("Total sin descuento: " + total.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Total con descuento del 10%: " + totalConDescuento.setScale(2, RoundingMode.HALF_UP));

        double sumaDouble = 0.1 + 0.2;
        BigDecimal sumaBigDecimal = new BigDecimal("0.1").add(new BigDecimal("0.2"));

        System.out.println("0.1 + 0.2 con double: " + sumaDouble);
        System.out.println("0.1 + 0.2 con BigDecimal: " + sumaBigDecimal);

        // Con double, 0.1 y 0.2 no tienen una representación binaria exacta,
        // por lo que el resultado es 0.30000000000000004 en lugar de 0.3.
        // BigDecimal, al construirse a partir de una cadena de texto y
        // representar los números de forma decimal exacta, no sufre este
        // problema y da como resultado exactamente 0.3.
    }
}
