public class Main {

    // ---------------------------------------------------------------
    // CÓDIGO ORIGINAL DEL ENUNCIADO (con los problemas sin corregir):
    // ---------------------------------------------------------------
    //
    // public static int leer(String[] datos, int i) {
    //    try {
    //       return Integer.parseInt(datos[i]);
    //    } catch (Exception e) {
    //    }
    //    return -1;
    // }
    //
    // ---------------------------------------------------------------
    // PROBLEMAS IDENTIFICADOS:
    // ---------------------------------------------------------------
    //
    // 1. Excepción silenciada (el problema más grave): el bloque catch
    //    está vacío. Si datos[i] no es un número válido o si i está
    //    fuera de rango, el error desaparece sin dejar ningún rastro:
    //    ni mensaje, ni log, nada. Quien llame a leer() y reciba un -1
    //    no puede distinguir "el valor leído era legítimamente -1" de
    //    "se produjo un error silencioso".
    //
    // 2. Tipo de excepción demasiado general: se captura Exception,
    //    cuando en realidad solo pueden producirse dos tipos concretos
    //    y conocidos: NumberFormatException (formato numérico inválido)
    //    y ArrayIndexOutOfBoundsException (índice i fuera de rango).
    //    Capturar Exception oculta además cualquier otro error
    //    inesperado que no se haya previsto, tratándolo igual que los
    //    dos casos esperados.
    //
    // 3. Valor de retorno -1 ambiguo: se usa un valor especial de
    //    retorno para señalar un error, el mismo enfoque que el propio
    //    capítulo desaconseja frente al uso de excepciones (Apartado
    //    "El mecanismo de excepciones"): obliga a quien llama a leer()
    //    a recordar comprobar ese valor, y si -1 fuera también un valor
    //    de entrada legítimo, el error pasaría completamente
    //    desapercibido.
    //
    // ---------------------------------------------------------------
    // VERSIÓN CORREGIDA:
    // ---------------------------------------------------------------
    //
    // En lugar de silenciar el error y devolver un valor especial, se
    // deja que las excepciones (ya con tipos específicos) se propaguen
    // hacia quien sí tiene contexto para decidir qué hacer. Esto exige
    // declarar los tipos comprobados... pero en este caso ambas
    // excepciones (NumberFormatException y ArrayIndexOutOfBoundsException)
    // son NO comprobadas, así que ni siquiera hace falta declararlas
    // con throws: basta con no capturarlas.
    public static int leer(String[] datos, int i) {
        return Integer.parseInt(datos[i]);
        // Si datos[i] no es numérico, se propaga NumberFormatException.
        // Si i está fuera de rango, se propaga ArrayIndexOutOfBoundsException.
        // En ambos casos, el llamador decide: puede capturarlas con un
        // multi-catch si quiere tratarlas igual, o dejar que se sigan
        // propagando si no tiene forma de recuperarse en este punto.
    }

    public static void main(String[] args) {
        String[] datos = { "10", "veinte", "30" };

        // El llamador, que sí conoce el contexto, decide cómo tratar
        // cada excepción específica en lugar de recibir un -1 ambiguo.
        int[] indicesAProbar = { 0, 1, 5 };
        for (int indice : indicesAProbar) {
            try {
                System.out.println("leer(datos, " + indice + ") = " + leer(datos, indice));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("No se pudo leer datos[" + indice + "]: "
                        + e.getClass().getSimpleName() + " - " + e.getMessage());
            }
        }
    }
}
