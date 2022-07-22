# Introducción al Stream API

Stream:

* Representa una abstracción para especificar cálculos agregados (acumulativos).

* Simplifica la descripción de los cálculos agregados (laziness,paralelismo).

## Elementos de un Stream
Un Stream se compone de 3 elementos:
* Un origen
* Cero o más operaciones intermedias
* Una operación final (da salida a un resultado)


  (Fuente o Origen) ------> |Operaciones Intermedias| ------> |Operaciones Intermedias| ------>  |Operaciones Finales| ------> (Resultado)

El API Stream se encuentra en el paquete `java.util.stream`.

#### Stream Sources (Origen o Fuente)
* Collections
* Generadores (Generators)
* Otros Streams

#### Operaciones Intermedias

* .filter
* .map
* .flatMap
* .peek
* .distinct
* .sorted
* .limit
* .substream

#### Operaciones Finales (Terminal Operations)

* reducers like reduce(), count(), findAny(), findFirst()
* collectors (collect())
* forEach
* iterators

### Streams de objetos y tipos primitivos
* Java tiene valores primitivos, así como tipos de objetos.
* Para mejorar la eficiencia de Stream tenemos tres Stream de tipos primitivos
    * IntStream, DoubleStream, LongStream
* Pueden usarse junto a los métodos mapToInt(), mapToDouble(), mapToLong()



### Consejos Prácticos
* Streams pueden ser infinitos, así como finitos. No existe el concepto de "ruptura" de un Stream. Utilice la operación final (terminal) correspondiente para detener el procesamiento O utilice el Stream de forma infinita.

* Evite forEach (excepto en casos especiales)

### Depuración(Debugging)
Algunas veces hacer debugging con expresiones lambdas resulta ser un poco tedioso. Las expresiones lambdas no se compilan como las clases anónimas, sino que son compiladas con llamadas a invokedynamic y su implementación se hace en tiempo de ejecución.

Una solución alternativa a estos casos es la siguiente:


- Extraer el código de una expresión Lambda en un método separado.
- Sustituir la expresión Lambda con method reference por un nuevo método.
- Establecer puntos de interrupción en las sentencias en el nuevo método.
- Examinar el estado del programa utilizando depurador.
