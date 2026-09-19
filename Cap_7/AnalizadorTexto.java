public class AnalizadorTexto {
    public static void main(String[] args) {
        String pangrama = "The quick brown fox jumps over the lazy dog";
        String frase = "Java es un lenguaje de programacion muy usado";

        System.out.println("Número de palabras: " + contarPalabras(frase));
        System.out.println("Palabra más larga: " + palabraMasLarga(frase));
        System.out.println("Palabras invertidas: " + invertirPalabras(frase));
        System.out.println("¿Es pangrama? (\"" + pangrama + "\"): " + esPangrama(pangrama));
        System.out.println("¿Es pangrama? (\"" + frase + "\"): " + esPangrama(frase));
    }

    static int contarPalabras(String texto) {
        String limpio = texto.trim();
        if (limpio.isEmpty()) {
            return 0;
        }
        return limpio.split("\\s+").length;
    }

    static String palabraMasLarga(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        String masLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > masLarga.length()) {
                masLarga = palabra;
            }
        }
        return masLarga;
    }

    static String invertirPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        StringBuilder resultado = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]);
            if (i > 0) {
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }

    static boolean esPangrama(String texto) {
        boolean[] letrasEncontradas = new boolean[26];
        String textoMinuscula = texto.toLowerCase();

        for (int i = 0; i < textoMinuscula.length(); i++) {
            char c = textoMinuscula.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letrasEncontradas[c - 'a'] = true;
            }
        }

        for (boolean encontrada : letrasEncontradas) {
            if (!encontrada) {
                return false;
            }
        }
        return true;
    }
}
