public class Main {
    public static void main(String[] args) {
        Contrato[] contratos = {
                new ContratoMovil("Ana García", 10.0, 20, 500),
                new ContratoFibra("Luis Pérez", 15.0, 600),
                new ContratoCombinado("Carmen Ruiz", 20.0, 30, 1000, 600)
        };

        for (Contrato c : contratos) {
            c.imprimirResumen();
        }
    }
}
