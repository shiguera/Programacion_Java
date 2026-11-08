// ---------------------------------------------------------------------
// ANÁLISIS: por qué la jerarquía propuesta viola el LSP
// ---------------------------------------------------------------------
//
// La jerarquía propuesta en el enunciado sería:
//
//   class Ave {
//       public void volar() { ... }
//   }
//
//   class Pinguino extends Ave {
//       @Override
//       public void volar() {
//           throw new UnsupportedOperationException("Los pingüinos no vuelan");
//       }
//   }
//
// El principio de sustitución de Liskov exige que, en cualquier lugar
// donde se use un objeto de la superclase (Ave), debe poder sustituirse
// por un objeto de una subclase (Pinguino) sin alterar el comportamiento
// esperado por el código cliente. Cualquier código que reciba un Ave y
// llame a volar() asume, razonablemente, que el ave volará: es el
// contrato que establece la superclase.
//
// Si ese código recibe en realidad un Pinguino, la llamada a volar()
// lanza una excepción en tiempo de ejecución en lugar de volar. El
// cliente no cambió su comportamiento, pero el programa falla donde
// antes funcionaba: sustituir Ave por Pinguino SÍ altera el
// comportamiento observable, así que la jerarquía viola el LSP.
//
// El problema de fondo es de diseño: "volar" no es una característica
// común a todas las aves (hay aves no voladoras: pingüinos, avestruces,
// kiwis...), así que no debería estar en la clase base Ave.
//
// ---------------------------------------------------------------------
// DISEÑO ALTERNATIVO (sin violar el LSP)
// ---------------------------------------------------------------------
//
// Se extrae la capacidad de volar a una interfaz separada, que solo
// implementan las aves voladoras. Ave ya no declara volar(): cualquier
// subclase de Ave sigue siendo sustituible por Ave sin sorpresas, y solo
// quien declara expresamente que implementa Volador se compromete a
// poder volar.

interface Volador {
    void volar();
}

abstract class Ave {
    protected String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}

class Aguila extends Ave implements Volador {
    public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela a gran altura.");
    }
}

class Pinguino extends Ave {
    public Pinguino(String nombre) {
        super(nombre);
    }

    public void nadar() {
        System.out.println(nombre + " nada velozmente.");
    }
}

public class Main {
    public static void main(String[] args) {
        Ave[] aves = { new Aguila("Águila real"), new Pinguino("Pingüino emperador") };

        for (Ave a : aves) {
            a.comer(); // válido para cualquier Ave, sin excepciones
        }

        // Solo se intenta volar con las aves que SÍ implementan Volador.
        // No hay ninguna rama que pueda lanzar una excepción en tiempo de
        // ejecución por intentar volar con un ave que no puede hacerlo:
        // el propio sistema de tipos lo impide.
        for (Ave a : aves) {
            if (a instanceof Volador v) {
                v.volar();
            } else {
                System.out.println(a.getClass().getSimpleName() + " no puede volar.");
            }
        }
    }
}
