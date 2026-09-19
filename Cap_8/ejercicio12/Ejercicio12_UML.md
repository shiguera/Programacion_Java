# Ejercicio 8.12 — Diagrama de clases UML (diseño previo a la implementación)

```mermaid
classDiagram
    class Dispositivo {
        <<sealed>>
        -String identificador
        -String direccionIp
        -String estado
        +Dispositivo(String identificador, String direccionIp, String estado)
        +getIdentificador() String
        +getDireccionIp() String
        +getEstado() String
        +toString() String
        +equals(Object obj) boolean
    }

    class Router {
        <<final>>
        -int numeroPuertosWan
        +Router(String identificador, String direccionIp, String estado, int numeroPuertosWan)
        +getNumeroPuertosWan() int
        +toString() String
        +equals(Object obj) boolean
    }

    class Switch {
        <<final>>
        -int numeroPuertos
        +Switch(String identificador, String direccionIp, String estado, int numeroPuertos)
        +getNumeroPuertos() int
        +toString() String
        +equals(Object obj) boolean
    }

    Dispositivo <|-- Router
    Dispositivo <|-- Switch
```

**Justificación de `sealed`:** el dominio modelado (dispositivos de una red
de telecomunicaciones gestionada) se restringe deliberadamente a un conjunto
cerrado y conocido de tipos, `Router` y `Switch`; no se pretende que
cualquier código externo pueda añadir tipos de dispositivo arbitrarios. Esto
justifica declarar `Dispositivo` como `sealed` con `permits Router, Switch`,
en vez de dejarla abierta a extensión libre.
