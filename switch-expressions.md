# Switch Expressions
Java SE 12 introdujo expresiones de cambio, que (como todas las expresiones) se evalúan en un solo valor y se pueden usar en declaraciones.

También introdujo el operador lambda en los case que eliminan la necesidad de declaraciones de break para evitar fallas.

https://docs.oracle.com/en/java/javase/13/language/switch-expressions.html

```java
public enum Day { SUNDAY, MONDAY, TUESDAY,
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

// ...

    int numLetters = 0;
    Day day = Day.WEDNESDAY;
    switch (day) {
        case MONDAY:
        case FRIDAY:
        case SUNDAY:
            numLetters = 6;
            break;
        case TUESDAY:
            numLetters = 7;
            break;
        case THURSDAY:
        case SATURDAY:
            numLetters = 8;
            break;
        case WEDNESDAY:
            numLetters = 9;
            break;
        default:
            throw new IllegalStateException("Invalid day: " + day);
    }
    System.out.println(numLetters);
```

Con `Switch Expressions`

```java
Day day = Day.WEDNESDAY;    
    System.out.println(
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        }
    );

```

Java SE 13 introduce un cambio para cambiar las expresiones: para especificar su valor, use la nueva declaración de rendimiento en lugar de la declaración de ruptura.

Day day = Day.WEDNESDAY;
   int numLetters = switch (day) {
       case MONDAY:
       case FRIDAY:
       case SUNDAY:
           System.out.println(6);
           yield 6;
       case TUESDAY:
           System.out.println(7);
           yield 7;
       case THURSDAY:
       case SATURDAY:
           System.out.println(8);
           yield 8;
       case WEDNESDAY:
           System.out.println(9);
           yield 9;
       default:
           throw new IllegalStateException("Invalid day: " + day);
   };
   System.out.println(numLetters);
