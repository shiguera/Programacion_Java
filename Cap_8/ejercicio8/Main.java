public class Main {
    public static void main(String[] args) {
        ResultadoRed exito = new Exito("Datos recibidos correctamente");
        ResultadoRed error = new Error("Tiempo de espera agotado", 408);

        System.out.println(exito);
        System.out.println(error);
    }
}
