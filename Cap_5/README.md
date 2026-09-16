# Capítulo 5 — Soluciones

| Ejercicio | Carpeta | Contenido |
|---|---|---|
| 5.1 | `ejercicio1/` | Clase `Rectangulo`: atributos privados, constructor, getters, `area()`, `perimetro()` |
| 5.2 | `ejercicio2/` | `Rectangulo` ampliada con constructores sobrecargados (por defecto y cuadrado) |
| 5.3 | `ejercicio3/` | `Temperatura`: validación en el modificador, conversión a Fahrenheit |
| 5.4 | `ejercicio4/` | `Contador`: campo estático `total` + campo de instancia `id` |
| 5.5 | `ejercicio5/` | `Intervalo`: atributos `final`, normalización en el constructor, inmutabilidad |
| 5.6 | `ejercicio6/` | `enum TipoUsuario` con campo, constructor y `getLimiteProyectos()` |
| 5.7 | `ejercicio7/` | `TablaCuadrados`: array estático precalculado con bloque `static { ... }` |

Cada carpeta se compila de forma independiente, por ejemplo:

```
cd ejercicio1
javac *.java
java Main
```
