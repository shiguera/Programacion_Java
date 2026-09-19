# Capítulo 7 — Soluciones

| Ejercicio | Fichero | Contenido |
|---|---|---|
| 7.1 | `MetodosString.java` | Métodos de `String`: `length()`, `toUpperCase()`, `contains()`, `replace()` |
| 7.2 | `InversionCadena.java` | Inversión manual con `StringBuilder` (sin `reverse()`) |
| 7.3 | `Palindromo.java` | Normalización y comprobación de palíndromo |
| 7.4 | `RepetirCadena.java` | Construcción eficiente de cadenas con `StringBuilder` |
| 7.5 | `CalculadoraMatematica.java` | `Math.PI`, `Math.pow`, `Math.hypot`, `Math.sin/cos`, `Math.log/log10` |
| 7.6 | `SimulacionDados.java` | `Random`, simulación de 10 000 lanzamientos |
| 7.7 | `ConversionTipos.java` | `Double.parseDouble()`, `Math.max/min`, `NumberFormatException` |
| 7.8 | `Autoboxing.java` | Caché de `Integer`, `==` vs `equals()` |
| 7.9 | `OrdenacionBusqueda.java` | `Arrays.sort()`, `Arrays.binarySearch()` |
| 7.10 | `CopiaArrays.java` | `Arrays.copyOf()`, `Arrays.copyOfRange()`, `Arrays.equals()` |
| 7.11 | `Producto.java` | `Objects.requireNonNull()`, `Objects.toString()` |
| 7.12 | `CalculosFinancieros.java` | `BigDecimal`, precisión decimal frente a `double` |
| 7.13 | `AnalizadorTexto.java` | Diseño libre: `String`/`StringBuilder` combinados |

## Notas

- **7.6**: el porcentaje obtenido variará ligeramente en cada ejecución al
  usar `Random` sin semilla fija; debería acercarse a la probabilidad
  teórica del 16,67 % según crece el número de lanzamientos.
- **7.7**: para comprobar el caso de error, ejecuta el programa introduciendo
  a propósito un valor no numérico (por ejemplo, `abc`) en alguna de las
  cinco entradas.
- **7.11**: el programa termina de forma abrupta con una traza de excepción
  al llegar a la última línea de `main()`, que crea un `Producto` con nombre
  `null` a propósito para mostrar el mensaje de error.
- **7.13**: se usa el pangrama inglés clásico ("The quick brown fox...")
  porque es un pangrama verificado; una frase española corta no
  necesariamente contiene las 26 letras del alfabeto inglés que comprueba
  `esPangrama()`.

Todos los ficheros son independientes y se compilan sueltos:
`javac NombreFichero.java && java NombreClase`.
