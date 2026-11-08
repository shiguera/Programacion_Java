# Capítulo 9 — Polimorfismo — Soluciones

| Ejercicio | Carpeta | Contenido |
|---|---|---|
| 9.1 | `ejercicio1/` | Polimorfismo básico: `Figura` abstracta, `Cuadrado`, `Triangulo` |
| 9.2 | `ejercicio2/` | Upcasting y enlace dinámico: jerarquía `Sensor` |
| 9.3 | `ejercicio3/` | Ocultación de miembros estáticos: `Vehiculo`/`Coche` |
| 9.4 | `ejercicio4/` | Downcasting seguro con `instanceof` clásico |
| 9.5 | `ejercicio5/` | El mismo ejercicio, con pattern matching `instanceof` |
| 9.6 | `ejercicio6/` | Clase abstracta con template method: `FormaGeometrica` |
| 9.7 | `ejercicio7/` | `getClass()` frente a `instanceof` sobre la jerarquía `Empleado` |
| 9.8 | `ejercicio8/` | Pattern matching en `switch`: jerarquía sellada `Mensaje` |
| 9.9 | `ejercicio9/` | Guardas (`when`) en las ramas del `switch` |
| 9.10 | `ejercicio10/` | Diseño con clase abstracta: jerarquía `Contrato` |
| 9.11 | `ejercicio11/` | Principio de sustitución de Liskov: `Ave`/`Pinguino` |
| 9.12 | `ejercicio12/` | Diagrama UML (Mermaid) de la jerarquía `Contrato` |
| 9.13 | `ejercicio13/` | Diseño libre: sistema de eventos `Evento` |

## Avisos importantes

**Fórmulas de recargo inventadas (Ejercicio 9.10).** El enunciado no
especifica ninguna fórmula concreta para los recargos de `ContratoMovil`,
`ContratoFibra` ni `ContratoCombinado`; las fórmulas usadas (2 €/giga,
0,05 €/minuto de voz, 0,10 €/Mbps, 10% de descuento al combinar ambos
servicios) son una propuesta razonable solo para ilustrar el patrón
*template method*, no un dato del libro.

**Diseño del Ejercicio 9.6.** Se ha añadido un método abstracto adicional
`getNombre()` a `FormaGeometrica`, no mencionado explícitamente en el
enunciado, para poder implementar `descripcion()` ("que imprima el nombre
de la figura...") de forma totalmente polimórfica, sin ningún `instanceof`
ni `getClass()` dentro del template method.

**Diseño del Ejercicio 9.11.** Es un ejercicio de diseño abierto: se
explica primero por qué la jerarquía propuesta (`Ave` con `volar()`
sobrescrito por `Pinguino` lanzando una excepción) viola el LSP, y luego se
propone una alternativa (interfaz `Volador` implementada solo por las aves
voladoras) con su propia implementación. Es una de varias soluciones
igualmente válidas.

**Diseño del Ejercicio 9.13.** Ejercicio de diseño libre: los atributos
concretos de cada tipo de evento (`nivelGravedad`, `vehiculosPorMinuto`,
`parametro`/`valorNuevo`) y los umbrales usados en `procesar()` son una
propuesta razonable, no datos fijados por el enunciado. Se ha declarado
`Evento` como `sealed` (no exigido explícitamente) para que la versión con
`switch` sea exhaustiva sin rama `default`, en línea con los Ejercicios 9.8
y 9.9.

**Requisito de versión de Java.** Varios ejercicios de este capítulo usan
características que requieren una versión reciente de Java:

- Clases `sealed`/`final`/`non-sealed` (Ejercicios 9.8, 9.9, 9.13): Java 17+.
- Pattern matching con `instanceof` (Ejercicios 9.5, 9.11): Java 16+.
- Pattern matching en `switch`, incluidas las guardas `when` (Ejercicios
  9.8, 9.9, 9.13): Java 21+.

