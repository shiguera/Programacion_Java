# Capítulo 4 — Sesiones de JShell (Ejercicios 4.10 y 4.12)

Estos dos ejercicios no producen un programa compilable: son secuencias de
comandos interactivos en JShell. Se documentan aquí como transcripción de
referencia; el objetivo es que el alumno reproduzca los pasos en su propia
sesión, ya que la salida exacta (identificadores `$1`, `$2`, etc.) puede
variar según lo que se haya tecleado antes.

## Ejercicio 4.10. Sesión de JShell

```
jshell> int cuadrado(int n) { return n * n; }
|  created method cuadrado(int)

jshell> cuadrado(3)
$2 ==> 9

jshell> cuadrado(7)
$3 ==> 49

jshell> cuadrado(12)
$4 ==> 144

jshell> /methods
|    int cuadrado(int)

jshell> /edit cuadrado
```

El comando `/edit cuadrado` abre un editor externo con el código fuente del
método. Ahí se modifica para que imprima un mensaje antes de devolver el
resultado:

```java
int cuadrado(int n) {
    System.out.println("Calculando el cuadrado de " + n);
    return n * n;
}
```

Al guardar y cerrar el editor, JShell confirma el cambio:

```
|  modified method cuadrado(int)

jshell> cuadrado(4)
Calculando el cuadrado de 4
$5 ==> 16

jshell> /save ejercicio10.jsh

jshell> /exit
|  Goodbye
```

Al volver a abrir JShell y cargar el fichero guardado, el método se recupera
con la versión modificada:

```
$ jshell

jshell> /open ejercicio10.jsh

jshell> cuadrado(5)
Calculando el cuadrado de 5
$1 ==> 25
```

El fichero `ejercicio10.jsh` resultante de `/save` contiene únicamente el
código fuente de las definiciones activas en la sesión, por ejemplo:

```java
int cuadrado(int n) {
    System.out.println("Calculando el cuadrado de " + n);
    return n * n;
}
```

## Ejercicio 4.12. Exploración libre en JShell

No hay una solución única; esto es un ejemplo de sesión válida:

```
jshell> Math.pow(2, 10)
$1 ==> 1024.0

jshell> Math.sin(Math.PI / 2)
$2 ==> 1.0

jshell> Math.log(Math.E)
$3 ==> 1.0

jshell> int x = 5
x ==> 5

jshell> double y = 3.14
y ==> 3.14

jshell> String texto = "hola"
texto ==> "hola"

jshell> /vars
|    int x = 5
|    double y = 3.14
|    String texto = "hola"

jshell> int doble(int n) { return n * 2; }
|  created method doble(int)

jshell> int doblePlusUno(int n) { return doble(n) + 1; }
|  created method doblePlusUno(int)

jshell> doblePlusUno(10)
$4 ==> 21

jshell> /reset
|  Resetting state.

jshell> /vars
(sin salida: no hay variables activas tras el reset)

jshell> doble(3)
|  Error:
|  cannot find symbol
|    symbol:   method doble(int)
```

El punto clave a comprobar es que, tras `/reset`, todas las definiciones
anteriores (variables y métodos) desaparecen: la sesión queda como si JShell
se acabara de abrir.
