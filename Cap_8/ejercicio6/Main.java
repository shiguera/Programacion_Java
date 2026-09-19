public class Main {
    public static void main(String[] args) {
        Dni valido = new Dni("12345678Z");
        Dni invalido = new Dni("ABC");

        System.out.println("Válido: " + valido);
        System.out.println("Inválido: " + invalido);

        // Nota: solo se valida el formato (ocho dígitos seguidos de una
        // letra mayúscula), no la letra de control real del DNI español,
        // que requiere un cálculo adicional no pedido por el enunciado.
    }
}
