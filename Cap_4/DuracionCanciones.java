public class DuracionCanciones {
    public static void main(String[] args) {
        int[] duraciones = {210, 180, 305, 240, 195};

        System.out.println("Duración mínima: " + duracionMinima(duraciones) + " s");
        System.out.println("Duración máxima: " + duracionMaxima(duraciones) + " s");
        System.out.printf("Duración media: %.2f s%n", duracionMedia(duraciones));
    }

    static int duracionMinima(int[] duraciones) {
        int minimo = duraciones[0];
        for (int duracion : duraciones) {
            if (duracion < minimo) {
                minimo = duracion;
            }
        }
        return minimo;
    }

    static int duracionMaxima(int[] duraciones) {
        int maximo = duraciones[0];
        for (int duracion : duraciones) {
            if (duracion > maximo) {
                maximo = duracion;
            }
        }
        return maximo;
    }

    static double duracionMedia(int[] duraciones) {
        int suma = 0;
        for (int duracion : duraciones) {
            suma += duracion;
        }
        return (double) suma / duraciones.length;
    }
}
