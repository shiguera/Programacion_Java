# Ejercicio 6.12 — Diagrama de clases UML (diseño previo a la implementación)

```mermaid
classDiagram
    class Libro {
        -String titulo
        -String autor
        -int anyoPublicacion
        +Libro(String titulo, String autor, int anyoPublicacion)
        +getTitulo() String
        +getAutor() String
        +getAnyoPublicacion() int
    }

    class Biblioteca {
        -String nombre
        -Libro[] libros
        -int numeroLibros
        +Biblioteca(String nombre)
        +anadirLibro(Libro libro) void
        +buscarPorTitulo(String titulo) Libro
        +imprimirCatalogo() void
    }

    Biblioteca "1" *-- "0..100" Libro : contiene
```

`Biblioteca` y `Libro` están unidas por **composición**: los libros se
almacenan en un array interno de `Biblioteca` con capacidad máxima de 100
elementos, y no se modela ninguna forma de que un `Libro` exista de forma
independiente a la biblioteca que lo gestiona en este diseño.
