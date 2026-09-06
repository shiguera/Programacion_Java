public class RefactorNotas {
    public static void main(String[] args) {
        double[] notas = {6.5, 4.0, 8.2, 3.9, 5.0};

        double media = calcularMedia(notas);
        int aprobados = contarAprobados(notas);

        mostrarMedia(media);
        mostrarAprobados(aprobados);
    }

    static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    static int contarAprobados(double[] notas) {
        int aprobados = 0;
        for (double nota : notas) {
            if (nota >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    static void mostrarMedia(double media) {
        System.out.printf("Media: %.2f%n", media);
    }

    static void mostrarAprobados(int aprobados) {
        System.out.println("Aprobados: " + aprobados);
    }

    // a) Nombres descriptivos: "proc" -> calcularMedia()/contarAprobados()/...,
    //    "n" -> "notas", "s" -> "suma", "m" -> "media".
    // b) Responsabilidad única: el cálculo de la media, el conteo de aprobados
    //    y la presentación de resultados están ahora en métodos independientes.
    // c) DRY: los dos bucles "for (int i = 0; i < n.length; i++)" del original
    //    se sustituyen por bucles for-each, eliminando la manipulación manual
    //    del índice, que se repetía de forma casi idéntica en ambos bucles.
}
