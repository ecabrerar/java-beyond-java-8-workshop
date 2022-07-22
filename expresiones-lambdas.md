# Expresiones lambdas

Una expresión lambda representa una función anónima.

`λx → x+x`
Función anónima que toma un número x y devuelve el resultado x + x.

Alonzo Church desarrolló en los años 30's el `Cálculo lambda`, un sistema formal en lógica matemática diseñado para investigar la definición de función, la noción de aplicación de funciones y la recursión.

Una expresión lambda se compone de un conjunto de parámetros, un operador lambda (->) y un cuerpo de la función.

(parametros) -> { cuerpo de la función}

¿Por qué  Java necesitaba Expresiones Lambda?
* Java necesitaba cambios para simplificar la codificación paralela.
* Es muy útil para evitar tener que escribir métodos que sólo utilizamos una vez.
* Simplifica cómo pasar comportamiento como un parámetro (podemos pasar expresiones lambda a métodos como argumentos).

### Interfaces Funcionales
El uso de lambda en Java fue posible gracias a lo que se conoce como interfaces funcionales.

En Java, una interfaz funcional es, básicamente, una interfaz con un único método abstracto.

Este tipo de interfaces también son conocidos como tipos `SAM (Single Abstract Method)`.

Las interfaces funcionales se encuentran en el paquete `java.util.function`

* Predicate<T>   - Recibe un argumento tipo T y retorna un booleano.
* Consumer<T>  - una acción que se realiza sobre un objeto
* Function<T,R>  - a funcion que transforma un valor T a R
* Supplier<T>      -   provee una instancia de T (como un factory).

* UnaryOperator<T> - Forma especializada de Function. Recibe un valor T como argumento y retorna del un valor del mismo tipo T.

* BinaryOperator<T> - Forma especializada de BiFunction. Recibe dos argumentos y retorna un resultado, todos del mismo tipo.

### Metodos Predeterminados("Default")
* Tradicionalmente, las interfaces no pueden tener definiciones de método (sólo declaraciones).
* Métodos predeterminados (Default) permite realizar implementaciones por defecto dentro de una interfaz.

### Method References
Nos permiten utilizar un método como una expresión lambda.

Formato: `target_reference::method_name`

##### Tipos:

* Método estático (ClassName::methName)
* Un método de instancia de un objeto particular (instanceRef::methName)
* Un  método super de un objeto particular (super::methName)
* Un método de instancia de un objeto arbitrario de un tipo particular (ClassName::methName)
* Un constructor de una clase (ClassName::new)
* Un constructor de un arreglo (TypeName[]::new)

### Nuevos métodos útiles en Java 8 que pueden utilizar Lambdas
* Iterable
Iterable.forEach(Consumer c)

* Collection
 Collection.removeIf(Predicate p)

* List
List.replaceAll(UnaryOperator o)
List.sort(Comparator c)
Reemplaza "Collections.sort(List l, Comparator c)"

### Programación Funcional
Un paradigma de programación donde las funciones son entidades de primera clase.

¿Qué significa eso?

Qué las funciones pueden ser usada de la misma forma que usamos enteros (integers) o cadenas de caracteres(strings).

Se pueden pasar funciones como parámetros a otras funciones y  pueden ser retornada como resultado de otras funciones.

El primer lenguaje ampliamente utilizado para programación funcional fue Lisp diseñado por John McCarthy en los años 50's

En las universidades frecuentemente se usa Haskell para la enseñanza.

Puedes empezar con JavaScript, Python, Scala o Java (a partir de Java 8)

¿Por qué utilizar programación funcional?
* Ley de Moore
* Programación Concurrente
* Inmutabilidad -> El estado no cambia
* Facilidad para programar concurrentemente
* Las funciones siempre devuelven el mismo resultado para cada entrada
* Reducción de la cantidad de líneas de código.
* Código más fácil de testear.

Programación Funcional vs Programación Imperativa

* Programación imperativa y programación funcional son dos enfoques muy diferentes.
* Imperativo.
  * Se utilizan cambios de estado.
  * Orden de ejecución se define como un contrato.
  * La repetición (loop)  es explícito y externo.
  * Efectos de lado.
  * Mutabilidad.

Funcional.
* Se utilizan funciones aritméticas.
* Orden de ejecución no se define.
* La repetición es a través del uso de la recursión.
* No hay efectos de lado.
* Inmutabilidad.

## Presta atención:

La programación funcional no va a resolver todos sus problemas de programación.

Es sólo otra herramienta en su arsenal. Algunos problemas son más fáciles de resolver utilizando técnicas de programación funcional.

Otros son más adecuados a la programación lógica.
Otros se hacen mejor usando programación orientada a objetos.
