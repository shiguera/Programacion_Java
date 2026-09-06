enum Estacion {
    INVIERNO, PRIMAVERA, VERANO, OTONO
}

public class RecorridoEstaciones {
    public static void main(String[] args) {
        for (Estacion estacion : Estacion.values()) {
            System.out.println(estacion.name() + " -> posición " + estacion.ordinal());
        }
    }
}
