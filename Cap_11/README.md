# Capítulo 11 — Excepciones — Soluciones

| Ejercicio | Carpeta | Contenido |
|---|---|---|
| 11.1 | `ejercicio1/` | Captura básica: `convertir(String)` con `NumberFormatException` |
| 11.2 | `ejercicio2/` | Múltiples `catch`: `dividir(String, String)` |
| 11.3 | `ejercicio3/` | Bloque `finally`: `ConexionSimulada` con fallo provocado |
| 11.4 | `ejercicio4/` | Lanzamiento con `throw`: `Angulo` con rango válido |
| 11.5 | `ejercicio5/` | Propagación con `throws`: `nivel1`/`nivel2`/`nivel3` |
| 11.6 | `ejercicio6/` | Excepción propia comprobada: `ConexionRechazadaException` |
| 11.7 | `ejercicio7/` | Excepción propia no comprobada: `FormatoMensajeException` |
| 11.8 | `ejercicio8/` | Multi-catch: `procesarEntrada(String[])` |
| 11.9 | `ejercicio9/` | `try`-with-resources: `BufferEscritura` |
| 11.10 | `ejercicio10/` | Encadenamiento de excepciones: `ErrorCargaConfiguracionException` |
| 11.11 | `ejercicio11/` | Buenas prácticas: análisis y corrección del método `leer()` |
| 11.12 | `ejercicio12/` | Diseño libre: jerarquía `ErrorRedException` y `SimuladorRed` |

## Avisos importantes

**Ejercicio 11.3.** La clase `ConexionSimulada` es exactamente la misma
que aparece en el Ejemplo del capítulo sobre `AutoCloseable`
(apartado de *try-with-resources*), reutilizada tal cual porque este
ejercicio pide explícitamente demostrar el uso de `finally`, no de
*try-with-resources*. Por eso en `Main.java` se abre y cierra la conexión
con un `try`/`finally` manual en lugar de un *try-with-resources* y se
lanza una `RuntimeException` dentro del `try` para comprobar que el
`finally` se ejecuta igualmente antes de que la excepción se propague.

**Ejercicio 11.2.** El método `dividir()` devuelve `Integer` (no `int`)
para poder devolver `null` cuando ninguna de las dos divisiones se
completa correctamente; no es un dato exigido por el enunciado, solo la
forma más simple de que el método tenga algún valor de retorno coherente
en el caso de error, ya que la propia naturaleza del ejercicio es
imprimir el mensaje de error, no devolver un valor sustituto.

**Ejercicio 11.11.** Se han identificado tres problemas en el método
original: (1) el bloque `catch` está vacío y silencia completamente el
error; (2) se captura `Exception` en vez de los dos tipos concretos que
realmente pueden producirse (`NumberFormatException` y
`ArrayIndexOutOfBoundsException`); (3) se usa un valor de retorno especial
(`-1`) para señalar el error, el mismo enfoque que el propio capítulo
desaconseja frente al uso de excepciones. La versión corregida deja que
ambas excepciones (no comprobadas) se propaguen, y es el código que llama
a `leer()` quien decide cómo tratarlas, con un multi-catch a modo de
ejemplo en `Main`.

**Ejercicio 11.12.** Es un ejercicio de diseño libre: la jerarquía
`ErrorRedException` se ha declarado `abstract` (no exigido explícitamente
por el enunciado) porque no tiene sentido lanzar directamente un error de
red genérico sin especificar de qué tipo concreto se trata. `SimuladorRed`
implementa `AutoCloseable` para ilustrar el uso de *try-with-resources*
que pide el enunciado, aunque el "recurso" que gestiona es solo simulado
(no hay ningún socket ni fichero real). Los dispositivos conocidos, el
dispositivo que provoca *timeout* y el criterio de paquete malformado
(ausencia de `":"`, igual que en el Ejercicio 11.7) son decisiones de
diseño razonables, no datos fijados por el enunciado.



Todos los ejercicios de este capítulo son compatibles con versiones de
Java relativamente antiguas (el *multi-catch* y el *try-with-resources*
datan de Java 7); no se requiere ninguna versión reciente.
