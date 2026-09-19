# Ejercicio 8.10 — Diagrama de clases UML

Jerarquía de tres niveles del Ejercicio 8.7.

```mermaid
classDiagram
    class Cuenta {
        -String titular
        -double saldo
        +Cuenta(String titular, double saldo)
        +getTitular() String
        +getSaldo() double
        #setSaldo(double saldo) void
        +toString() String
    }

    class CuentaAhorro {
        -double tipoInteres
        +CuentaAhorro(String titular, double saldo, double tipoInteres)
        +getTipoInteres() double
        +aplicarInteres() void
        +toString() String
    }

    class CuentaAhorroInfantil {
        -double limiteRetirada
        +CuentaAhorroInfantil(String titular, double saldo, double tipoInteres, double limiteRetirada)
        +getLimiteRetirada() double
        +retirar(double cantidad) boolean
        +toString() String
    }

    Cuenta <|-- CuentaAhorro
    CuentaAhorro <|-- CuentaAhorroInfantil
```

**Notas:**

- `setSaldo()` se marca como `#` (protected): solo las subclases lo usan, no
  forma parte de la API pública de la clase.
- Las flechas `<|--` representan herencia (generalización), con la punta
  hueca apuntando hacia la superclase.
- Ninguna de las tres clases es `final` ni `sealed` en este ejercicio, así
  que no se añade ninguna restricción de ese tipo al diagrama.
