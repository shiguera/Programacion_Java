---
practica: 9
---

# Ejercicio 9.12 — Diagrama UML de la jerarquía `Contrato`

Diagrama de clases de la jerarquía `Contrato` implementada en el Ejercicio 9.10. La clase abstracta y su método abstracto se muestran en cursiva, siguiendo la convención UML.

```mermaid
classDiagram
    class Contrato {
        <<abstract>>
        #String titular
        #double precioBase
        +Contrato(String titular, double precioBase)
        +getPrecioFinal() double
        +imprimirResumen() void
    }

    class ContratoMovil {
        -int gigas
        -int minutosVoz
        +ContratoMovil(String titular, double precioBase, int gigas, int minutosVoz)
        +getPrecioFinal() double
    }

    class ContratoFibra {
        -int velocidadMbps
        +ContratoFibra(String titular, double precioBase, int velocidadMbps)
        +getPrecioFinal() double
    }

    class ContratoCombinado {
        -int gigas
        -int minutosVoz
        -int velocidadMbps
        +ContratoCombinado(String titular, double precioBase, int gigas, int minutosVoz, int velocidadMbps)
        +getPrecioFinal() double
    }

    Contrato <|-- ContratoMovil
    Contrato <|-- ContratoFibra
    Contrato <|-- ContratoCombinado
```

**Notas sobre la notación:**

- `Contrato` aparece marcada `<<abstract>>` y su método `getPrecioFinal()` está declarado sin cuerpo en la clase abstracta (en el propio capítulo, la convención UML para miembros abstractos es la cursiva; Mermaid no soporta cursiva en texto de clase, así que aquí se indica con el estereotipo `<<abstract>>`, igual que en los diagramas de capítulos anteriores).
- `imprimirResumen()` es un método concreto (template method) definido solo en `Contrato`; las tres subclases lo heredan sin sobrescribirlo.
- Las flechas `<|--` representan herencia: las tres subclases concretas extienden `Contrato`.
- La visibilidad sigue la convención habitual: `+` público, `-` privado, `#` protegido.
