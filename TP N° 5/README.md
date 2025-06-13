# Trabajo Práctico 5 – Herencia – Parte 2

1. Defina una clase Figura que tenga los siguientes atributos:
- Color
- Coordenada del centro de la forma (Defina una clase Punto con atributos coordenadaX y coordenadaY)
- Nombre de la forma

Y, al menos, los siguientes métodos:
- toString. Sobrescribir el método heredado de Object
- Obtener y cambiar el color
- Mover la forma (o sea, su centro)

Defina una subclase Rectángulo que herede de Figura y tenga los siguientes atributos:
- Lado menor
- Lado mayor

Y, al menos, los siguientes métodos:
- toString. Debe retornar un string mostrando que se trata de un rectángulo, su nombre, color, centro y lado. Debería usarse la función toString de la clase base para realizar parte de este trabajo.
- Calcular el área (lado menor * lado mayor)
- Calcular el perímetro. (2 * lado menor + 2 * lado mayor)
- Cambiar el tamaño del rectángulo. Recibe como parámetro un factor de escala. Así, por ejemplo, si el factor vale 2, el rectángulo duplicará su tamaño y si es 0,5 se reducirá a la mitad. ¿Qué pasaría o cómo deberían manejar un factor de escala negativo o cero?

### a) Realice un programa que pruebe el funcionamiento de estas clases. Debe crear objetos y comprobar el correcto funcionamiento de las funciones miembro.

### b) Defina una subclase Elipse que herede de Figura.  
Recordatorio: una elipse queda definida por su radio mayor (R) y su radio menor (r), tal que el área de una elipse es igual a π*(R*r).  
Agregue los métodos toString(), y para calcular el área, perímetro (use una fórmula simplificada) y cambiar el tamaño, al igual que en Rectángulo.

### c)Defina una clase Cuadrado que herede de la clase Rectángulo.  
¿Cómo debería ser el constructor de Cuadrado?  
Si Rectángulo tuviera métodos como setLadoMenor() y setLadoMayor(), ¿Cómo debería Cuadrado sobrescribirlos para mantener la integridad de un cuadrado (donde ambos lados deben ser iguales)?

### d) Defina una clase Círculo que herede de la clase Elipse.  
¿Cómo sería su constructor y cómo se relaciona con el de Elipse? (Radio mayor = Radio menor)

### e)Realice un programa que defina varias figuras diferentes, cree una collection de objetos de la clase Figura.  
El programa debe realizar un bucle que recorra todas las figuras, las ponga todas del mismo color y las mueva a una determinada posición.

### f) Analice qué ocurre en el ejercicio anterior si se intenta imprimir la información de cada figura (llamando al método toString) y qué sucede si se intenta obtener en ese bucle el área y perímetro de todas las figuras de la collection.

### g) Utilice la técnica de polimorfismo para arreglar los comportamientos anómalos detectados en el paso anterior.

### h) ¿Cómo haría para obligar que todas las clases futuras que hereden de Figura tengan al menos los métodos “área” y “perímetro”?  
¿Tiene sentido incluir definir dichos métodos en la clase Figura?

### i) Haga un diagrama de clases que refleja la estructura definida hasta el momento.  
Añádale las clases: Punto, Línea, Triángulo, Triángulo Rectángulo y Polígono.  
¿Cuáles serían sus atributos y métodos?  
¿Cómo son las relaciones entre ellas?

---

## Recomendaciones

- Utilizar la anotación `@Override` (en Java) al sobrescribir métodos para ayudar a detectar errores.
- Seguir convenciones de nomenclatura para clases, métodos y variables.
- Comentar el código cuando sea necesario.

**UADER – Facultad de Ciencia y Tecnología – Licenciatura en Sistemas**  

