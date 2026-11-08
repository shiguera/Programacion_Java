# Capítulo 10 — Interfaces — Soluciones

| Ejercicio | Carpeta | Contenido |
|---|---|---|
| 10.1 | `ejercicio1/` | Primera interfaz: `Describible` implementada por tres clases sin relación entre sí |
| 10.2 | `ejercicio2/` | Múltiples interfaces: `Encendible` y `Regulable` en `LuzInteligente` |
| 10.3 | `ejercicio3/` | Polimorfismo con interfaces: `Exportable` en `Contacto` y `Factura` |
| 10.4 | `ejercicio4/` | Método `default`: `Validable` en `DireccionEmail` y `CodigoPostal` |
| 10.5 | `ejercicio5/` | Conflicto entre métodos `default`: `InterfazA`/`InterfazB`/`MiClase` |
| 10.6 | `ejercicio6/` | Interfaz funcional propia: `Transformable` |
| 10.7 | `ejercicio7/` | Interfaz sellada: `Forma` con pattern matching en `switch` |
| 10.8 | `ejercicio8/` | Diagrama UML (Mermaid) del sistema `Serializable`/`Sensor` del ejercicio 10.9 |
| 10.9 | `ejercicio9/` | Clase abstracta e interfaz combinados: `Sensor implements Serializable` |
| 10.10 | `ejercicio10/` | Diseño libre: sistema de plugins `Plugin`/`GestorPlugins`, con UML previo |

## Avisos importantes

**Posible errata en el enunciado del Ejercicio 10.8.** El texto del
capítulo dice literalmente que hay que dibujar "el diagrama de clases UML
completo del sistema del ejercicio~10.8" (se refiere a sí mismo), lo que
con toda probabilidad es una errata, así que el diagrama se ha resuelto
con el sistema del Ejercicio 10.9.

**Nombre `Serializable` (Ejercicio 10.9).** La interfaz que pide el
enunciado se llama igual que `java.io.Serializable`. Como no se importa
ese paquete en ningún fichero, no hay ambigüedad real: el compilador usa
la interfaz definida en este mismo paquete. Se señala porque,
en un proyecto más grande, convendría elegir un nombre que no choque con
una interfaz tan conocida de la biblioteca estándar.

**Método `default` que necesita estado interno (Ejercicio 10.2).** Las
interfaces no pueden declarar atributos de instancia, así que el método
`default isEncendido()` que pide el enunciado no puede acceder
directamente a ningún estado. Se ha añadido un método abstracto adicional,
`consultarEncendido()`, que cada clase implementadora debe definir
devolviendo su propio campo interno, y del que `isEncendido()` no es más
que un alias `default`. Es una solución de diseño razonable al problema,
no un dato que exigiera el enunciado.

**Requisito de versión de Java.** Este capítulo usa dos características
que requieren Java reciente:

- Interfaces `sealed` (Ejercicio 10.7): Java 17+.
- Pattern matching en `switch` (Ejercicio 10.7): Java 21+.
- El resto de ejercicios (métodos `default`, interfaces funcionales,
  `@FunctionalInterface`) solo requieren Java 8+.
