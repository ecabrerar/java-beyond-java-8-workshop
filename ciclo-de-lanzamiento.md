# Ciclo de lanzamiento de Java

Java 9 representó el final de la era de las versiones Java basadas en funciones.

En el pasado, se seleccionaron algunas características importantes, y cada vez que estaban listas, se realizó una nueva versión principal de Java.

En la práctica, esto condujo a duración de al menos tres años entre lanzamientos importantes. Eso no es aceptable en estos tiempos, por lo que Oracle y el proyecto OpenJDK cambiaron a versiones basadas en el tiempo.

Ahora, cada 6 meses se lanzará una nueva versión de Java. Conteniendo todas las características que estén listas para ese momento.

Entre estos lanzamientos de 6 meses, las actualizaciones con soluciones críticas aún se pueden lanzar cuando sea necesario.

# Versiones con soporte a largo plazo (LTS)

La actualización de su versión de Java cada 6 meses no es una perspectiva tentadora para muchas organizaciones. Por lo tanto, existen versiones de soporte a largo plazo (LTS) designadas cada 2 años a partir de Java 17 (inicialmente fueron 3 años).

La primera versión de LTS fue lanzada en septiembre de 2018. Java SE 7, 8, 11 y 17 son versiones LTS.

Ver [Oracle Java SE Support Roadmap] (https://www.oracle.com/java/technologies/java-se-support-roadmap.html)

En conclusión, desde una perspectiva de operaciones, es recomendable usar versiones con soporte a largo plazo (LTS). Desde una perspectiva de desarrollo, muchas veces hay cambios importantes en versiones que no tienen soporte a largo plazo y motivan a su rápida adopción.

# Alternativas a Oracle JDK

### Azul Platform Core
https://www.azul.com/products/core/azul-platform-core-embedded-comparison-matrix/


### Adoptium
Anteriormente [AdoptOpenJDK](https://adoptopenjdk.net/about.html) proporcionaba soporte a OpenJDK y Eclipse OpenJ9.

Actualmente [Adoptium](https://adoptium.net) le da soporte a `Eclipse Temurin` y `IBM Semeru Runtimes`.

Eclipse Temurin ofrece imágenes `OpenJDK + Hotspot`, e `IBM Semeru Runtimes` en el futuro ofrecerá versiones abiertas y certificadas (JCKed) de imágenes OpenJDK + Eclipse OpenJ9.

### Amazon Corretto
Amazon Corretto es una distribución sin costo, multiplataforma y lista para producción del Open Java Development Kit (OpenJDK).

https://docs.aws.amazon.com/corretto/

### Red Hat OpenJDK
La implementación de OpenJDK de Red Hat es una implementación gratuita y de código abierto de la plataforma Java, edición estándar (Java SE).

https://access.redhat.com/articles/1299013

### Liberica JDK
Liberica JDK es la implementación de OpenJDK con funciones adicionales y mejoras de seguridad. Es soportada por el mismo equipo de BellSoft que desarrolla Liberica JDK.

https://bell-sw.com/pages/downloads/
