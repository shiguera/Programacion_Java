# Capítulo 6 — Soluciones

| Ejercicio | Carpeta | Contenido |
|---|---|---|
| 6.1 | `ejercicio1/` | Aliasing entre dos variables `Segmento` |
| 6.2 | `ejercicio2/` | Asignación simple vs. constructor de copia (`Punto`) |
| 6.3 | `ejercicio3/` | Comprobación de `null` antes de usar un objeto |
| 6.4 | `ejercicio4/` | `CuentaBancaria`: convención JavaBeans, `isActiva()` |
| 6.5 | `ejercicio5/` | Tres estrategias de encapsulación (`RangoA`, `RangoB`, `RangoC`) |
| 6.6 | `ejercicio6/` | `Calculadora` (métodos estáticos) usada desde `Informe` |
| 6.7 | `ejercicio7/` | `Cuenta` y transferencia entre dos objetos |
| 6.8 | `ejercicio8/` | Agregación: `Persona` y `Direccion` compartida |
| 6.9 | `ejercicio9/` | Composición: `Coche` crea y delega en su propio `Motor` |
| 6.10 | `ejercicio10/` | `Factura`/`LineaFactura` organizadas en paquetes |
| 6.11 | `ejercicio11/` | Diagrama UML (Mermaid) de `Coche`, `Motor` y `Cuenta` |
| 6.12 | `ejercicio12/` | Diseño libre: sistema `Biblioteca`/`Libro`, con UML previo |

## Avisos importantes

**Clases tomadas del texto del capítulo.** Los Ejercicios 6.1–6.3 usan la
clase `Punto` tal como se define en el capítulo (atributos públicos `x`, `y`
de tipo `int`, sin getters/setters, con constructor normal y constructor de
copia) y la clase `Segmento` del apartado de agregación (`origen`/`destino`
privados, recibidos ya construidos en el constructor, con solo getters). El
Ejercicio 6.10 usa la interfaz de `Factura`/`LineaFactura` que aparece en el
apartado de paquetes (`Factura(String cliente, int capacidadMaxima)`,
`agregarLinea(String concepto, int cantidad, double precioUnitario)`,
`imprimir()`), solo que reorganizadas en el paquete `facturacion.modelo` que
pide el enunciado en vez de `com.ejemplo.gestion.modelo`.

**Compilación del Ejercicio 6.10 (paquetes).** A diferencia del resto, este
ejercicio no se compila con `javac *.java` dentro de su carpeta, porque las
clases están organizadas en paquetes reales. Desde `ejercicio10/`:

```
javac facturacion/modelo/*.java facturacion/main/*.java
java facturacion.main.Main
```

**Ejercicios 6.11 y 6.12 (UML).** Los diagramas están escritos en sintaxis
Mermaid dentro de un `.md`, que GitHub renderiza automáticamente al ver el
fichero en el navegador.
