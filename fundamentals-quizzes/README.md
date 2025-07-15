# ❓🥁 Batería de preguntas sobre conceptos fundamentales

> Listado de preguntas útiles para pruebas de nivel.
---

## ☕ Preguntas sobre conceptos básicos de java:
1. ¿Qué modificadores de visibilidad existen en java? Explica el alcance de cada uno.
> - public: accesible desde cualquier lugar;
> - protected: accesible en el mismo paquete y subclases;
> - default (sin modificador): accesible solo en el mismo paquete;
> - private: accesible solo en la clase.

2. ¿Qué es una clase `record`? ¿Cuál es su utilidad?
> Una clase inmutable que encapsula datos y genera automáticamente métodos como `equals()`, `hashCode()` y `toString()`.

3. ¿Cuál es el primitivo con menor rango numérico? ¿Cuánto ocupa?
> byte; ocupa 8 bits (1 byte).

4. ¿Cuánto ocupa un `long`?
> 64 bit.

5. ¿Cuál es el mayor primitivo en rango absoluto de valores numéricos?
> double; 64 bits.

6. ¿Puede una interfaz extender de otra interfaz?
> Sí.

7. ¿Cómo se implementa una clase abstracta?
> Mediante una subclase, utilizando la palabra reservada `extends`.

8. ¿Cómo se define una clase abstacta?
> Con la palabra clave `abstract` antes de `class`. Debe tener al menos un método abstracto.

9. ¿Para qué se utiliza la anotación `@Override`?
> Para indicar que un método sobrescribe otro de la superclase o interfaz.

10. ¿Qué es una "lambda"?
> Una función anónima que se puede asignar a una variable o pasar como argumento.

11. ¿Qué implica que un atributo de clase sea `abstract`?
> Los atributos no pueden ser abstractos.

12. ¿Qué implica que un atributo de clase sea `final`?
> Que no puede cambiar su valor después de inicializarse.

13. ¿Cómo se declara una constante?
> Con `static final`.

14. ¿Qué tipo de dato es un `String`?
> Una clase (objeto) inmutable.

15. ¿Qué son las clases `wrappers`? ¿Cuáles conoces?
> Clases que encapsulan tipos primitivos; `Integer`, `Double`, `Float`, `Boolean`, `Long`, `Short`, `Byte`, `Character`.

16. ¿De qué manera compara java los objetos por defecto?
> Por referencia (dirección de memoria).

17. ¿Qué debo hacer para comparar objetos según sus atributos?
> Sobrescribir el método `equals()`.

18. ¿Se puede sobreescribir el método `toString()`?
> Sí.

19. ¿Qué implica que un método sea abstracto?
> Que no tiene implementación y debe definirse en una subclase.

20. ¿Puede tener cuerpo un método de interfaz?
> Sí, si es `default` o `static`.

21. ¿Qué utilidad tienen los "enums"?
> Definir un conjunto fijo de constantes.

22. ¿Qué métodos de "enums" conoces?
> `values()`, `valueOf()`, `name()`, `ordinal()`.

23. ¿Para qué se utiliza la anotación `@BeforeEach`?
> Para ejecutar un método antes de cada prueba en JUnit.

24. ¿En qué consiste el TDD?
> Escribir primero las pruebas y luego el código que las hace pasar.

25. ¿En qué consiste el uso de `try-with-resources`?
> Cierra automáticamente recursos que implementan `AutoCloseable`.

26. ¿Qué diferencia existe entre las clases `RuntimeException` y `Exception`?
> `RuntimeException` no requiere manejo obligatorio; `Exception` sí.

27. ¿Qué significa "sobrecargar" un constructor?
> Definir varios constructores con distintos parámetros.

28. ¿Qué diferencia la interfaz `Set` de la interfaz `List`?
> `Set` no permite duplicados; `List`, sí.

29. ¿Cómo pasa java los argumentos: por valor o por referencia?
> Por valor.

30. Cuando se pasa un primitivo como argumento ¿se modifica su valor original dentro del método?
> No.

31. ¿Qué sucede cuando se instancia una clase? ¿Qué debo hacer para instanciarla?
> Se crea un objeto en memoria; usando `new` y un constructor.

32. ¿Las clases abstractas pueden ser instanciadas?
> No.

33. ¿Las clases abstractas tienen constructor?
> Sí.

34. ¿Una clase puede tener más de un constructor?
> Sí.

35. ¿De qué manera llama una clase hija al constructor de la clase padre?
> Usando `super()`.

36. ¿Pueden las clases hijas acceder directamente a los atributos que heredan?
> Depende del modificador de visibilidad.

37. ¿Pueden las interfaces tener atributos?
> Sí.

38. ¿Cómo se declaran los atributos de una interfaz?
> Como `public static final`.

39. ¿Qué implica que un atributo sea `static final`?
> Que es una constante y pertenece a la clase.

40. ¿Se pueden crear anotaciones personalizadas en java?
> Sí.

41. ¿La clase `Object` es un tipo de dato genérico?
> No.

42. ¿Cuál es la diferencia entre la clase `Object` y los tipos genéricos?
> `Object` puede referenciar cualquier objeto, pero requiere casting; genéricos permiten tipado seguro.

43. ¿Cuál es la utilidad de una interfaz `Map`?
> Almacenar pares clave-valor.

44. ¿Qué colección debería implementar para crear una lista de elementos ordenados sin repeticiones?
> `TreeSet`.

45. ¿Qué compara el operador `==`?
> Las referencias (dirección de memoria).

46. ¿Qué compara el método `equals()`?
> El contenido (dependiendo de la implementación).

47. ¿Cuál es la relación que existe entre los métodos `equals()` y `hashCode()`?
> Si `equals()` es true, `hashCode()` debe ser igual.

48. ¿Qué tipo de dato retorna el método `hashCode()`? ¿Para qué se utiliza? ¿Qué representa?
> `int`; se usa en estructuras hash; representa un código de dispersión.

49. En una palabra ¿qué define una interfaz?
> Contrato.

50. ¿Qué principio básico de la POO define mejor a una interfaz?
> Abstracción.

51. ¿Qué significa que una clase (objeto) es inmutable?
> Que su estado no puede cambiar después de crearse.

52. ¿Por qué utilizar un `wrapper` antes que un primitivo?
> Para trabajar con colecciones o usar métodos de utilidad.
