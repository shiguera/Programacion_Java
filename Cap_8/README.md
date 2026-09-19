# Capítulo 8 — Soluciones

**Requisito de versión:** los Ejercicios 8.8, 8.9 y 8.12 usan clases
`sealed`/`non-sealed`, que requieren **Java 17 o posterior** para compilar.
El resto del capítulo no tiene requisitos especiales de versión.

| Ejercicio | Carpeta | Contenido |
|---|---|---|
| 8.1 | `ejercicio1/` | `Vehiculo` y `Coche`: primera jerarquía, `toString()` sobrescrito |
| 8.2 | `ejercicio2/` | Se añade `Camion`; orden de ejecución de constructores en cadena |
| 8.3 | `ejercicio3/` | Método `protected descripcionBase()` reutilizado en `Coche` |
| 8.4 | `ejercicio4/` | `Figura`, `Cuadrado`, `Triangulo`: sobrescritura de `area()` |
| 8.5 | `ejercicio5/` | `Libro`: `toString()`, `equals()` y `hashCode()` basados en el ISBN |
| 8.6 | `ejercicio6/` | `Dni`: clase `final`, validación de formato en el constructor |
| 8.7 | `ejercicio7/` | Jerarquía de tres niveles: `Cuenta` → `CuentaAhorro` → `CuentaAhorroInfantil` |
| 8.8 | `ejercicio8/` | `ResultadoRed` sellada, con `Exito` y `Error` como `final` |
| 8.9 | `ejercicio9/` | `Error` pasa a `non-sealed`; nueva subclase `ErrorTimeout` |
| 8.10 | `ejercicio10/` | Diagrama UML (Mermaid) de la jerarquía del Ejercicio 8.7 |
| 8.11 | `ejercicio11/` | Herencia vs. composición: `Conductor`, `Autobus`, `LineaAutobus` (agregación) |
| 8.12 | `ejercicio12/` | Diseño libre: `Dispositivo` sellada, `Router` y `Switch` |

## Notas

- **8.2**: los tres constructores (`Vehiculo`, `Coche`, `Camion`) imprimen un
  mensaje para poder observar el orden real de ejecución al crear un
  `Camion`.
- **8.6**: `Dni` solo valida el formato (ocho dígitos + una letra mayúscula),
  no la letra de control real del DNI español, que no pedía el enunciado.
- **8.8/8.9**: la clase se llama `Error`, igual que `java.lang.Error`; esto
  es válido en Java (nombres distintos completamente cualificados), pero
  conviene saber que existe esa coincidencia de nombre si se combina este
  código con otras clases del paquete `java.lang`.
- **8.10, 8.11, 8.12**: los diagramas están en Mermaid dentro de un `.md`,
  que GitHub renderiza automáticamente.
- **8.11**: es el ejercicio clave sobre herencia frente a composición — la
  conclusión de diseño (ninguna relación de herencia, agregación en ambos
  casos) está justificada en el propio `.md`.

Cada carpeta se compila de forma independiente:

```
cd ejercicio1
javac *.java
java Main
```
