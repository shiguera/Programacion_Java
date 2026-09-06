# Capítulo 4 — Soluciones

| Ejercicio | Fichero | Contenido |
|---|---|---|
| 4.1 | `ImprimirLinea.java` | Método sin parámetros ni retorno, invocado varias veces |
| 4.2 | `ImprimirNVeces.java` | Método con parámetros (`String`, `int`) |
| 4.3 | `ConversionTemperatura.java` | Método con retorno; incluye Javadoc (ver también 4.16) |
| 4.4 | `MaximoDeDos.java` | Método con dos parámetros y retorno |
| 4.5 | `PasoPorValor.java` | Paso de argumentos por valor |
| 4.6 | `EsPar.java` | Método booleano |
| 4.7 | `Signo.java` | Retorno en todas las ramas |
| 4.8 | `NumeroPrimo.java` | Método booleano con bucle; incluye Javadoc (ver también 4.16) |
| 4.9 | `DuracionCanciones.java` | Descomposición en varios métodos sobre un array |
| 4.10 | `Cap_4_JShell.md` | Sesión de JShell (`/methods`, `/edit`, `/save`, `/open`) |
| 4.11 | `AmbitoVariables.java` | Ámbito de variables locales |
| 4.12 | `Cap_4_JShell.md` | Exploración libre en JShell (`/vars`, `/reset`) |
| 4.13 | `ClausulasDeGuarda.java` | Refactorización: cláusulas de guarda vs. retorno único |
| 4.14 | `FuncionPura.java` | Separación de función pura y acción con efecto secundario |
| 4.15 | `RefactorNotas.java` | Nombres descriptivos, responsabilidad única, DRY |
| 4.16 | *(integrado en 4.3 y 4.8)* | Documentación Javadoc de `celsiusAFahrenheit()` y `esPrimo()` |

**Nota sobre el Ejercicio 4.16:** en vez de duplicar el código de los
Ejercicios 4.3 y 4.8, la documentación Javadoc se añadió directamente a esos
mismos ficheros. Para generar la documentación HTML:

```
javadoc -d doc ConversionTemperatura.java NumeroPrimo.java
```

**Nota sobre los Ejercicios 4.10 y 4.12:** no son programas compilables, sino
sesiones interactivas de JShell; se documentan como transcripción en
`Cap_4_JShell.md`.
