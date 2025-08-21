# 1. Objetivos del Trabajo Práctico
• Comprender la importancia de la programación defensiva para crear software robusto.
• Aprender a crear y utilizar excepciones personalizadas para un manejo de errores
específico del dominio del problema.
• Identificar y corregir anti-patrones comunes en el manejo de excepciones, como "tragar"
excepciones o el uso incorrecto del bloque finally.
• Refactorizar código existente para mejorar su claridad, seguridad y eficiencia.

# 2. Marco Teórico
En la programación, no es suficiente que el código funcione en el "camino feliz" (cuando todo sale
como se espera). Un software de calidad debe ser capaz de anticipar y manejar situaciones anómalas
o errores de manera controlada.
• Excepciones: Son eventos que ocurren durante la ejecución de un programa y que alteran el
flujo normal de las instrucciones. Java utiliza un sistema de try-catch-finally para
manejar estos eventos.
• Programación Defensiva: Es una técnica de diseño que consiste en validar las entradas y el
estado interno de un objeto antes de realizar una operación. Su lema es "fallar rápido"
(fail-fast): es mejor detectar un error en el momento y lugar exacto en que se produce, en
lugar de permitir que el programa continúe en un estado inconsistente.
• Excepciones Personalizadas: En lugar de usar excepciones genéricas como Exception o
RuntimeException, podemos crear nuestras propias clases de excepción (heredando de
Exception) para representar errores específicos de nuestra aplicación (ej.
MatrizException, SaldoInsuficienteException). Esto hace que el código sea
más legible y el manejo de errores más preciso.

# 3. Código Fuente Inicial
Codigo usado y reparado en el trabajo actual. Este código es funcional en escenarios ideales, pero
presenta varias deficiencias en el manejo de errores que deberán ser corregidas (Ya se corrigio en la entrega de este trabajo).

# 4. Consignas del Trabajo
## Parte A: Mejorar la Clase de Excepción
1. Utilizar Constantes para Códigos de Error: En MatrizException.java, reemplaza
el uso de "números mágicos" (0, 1, etc.) por constantes públicas estáticas y finales (public
static final int). Esto hace que el código que lanza la excepción sea más legible.
2. Ampliar los Mensajes de Error: Agrega nuevos mensajes al arreglo ERRORES para cubrir
todas las validaciones que se implementarán a continuación (ej: dimensiones negativas,
índices fuera de rango para filas y columnas).

## Parte B: Refactorizar la Clase MatrizObjetos
1. Validación Completa en el Constructor: Mejora el constructor para que valide no solo el
máximo de columnas, sino también:
• El máximo de filas (max_rows).
• Que las dimensiones (filas y columnas) no sean números negativos o cero.
• Lanza la MatrizException apropiada usando los nuevos códigos de error.
2. Implementar Programación Defensiva en setRowCol:
• Elimina por completo el bloque try-catch.
• Añade validaciones antes de intentar acceder al arreglo para asegurarte de que row y
col estén dentro de los límites válidos de la matriz.
• Si una validación falla, lanza una MatrizException con el código de error
correspondiente.
• Modifica la firma del método para indicar que puede lanzar esta excepción (throws
MatrizException)
3. Corregir el Anti-Patrón en getRowCol:
• Elimina por completo el bloque try-catch-finally. Este método no debe
ocultar los errores.
• Aplica la misma lógica de programación defensiva que en setRowCol: valida los
índices row y col primero.
• Si los índices son inválidos, lanza la MatrizException apropiada.
• Si son válidos, retorna el objeto.
• No olvides actualizar la firma del método con throws MatrizException.

## Parte C: Ampliar las Pruebas
1. Actualizar la clase App.java: Modifica el método main para que pruebe de forma
explícita los nuevos casos de error. Asegúrate de incluir:
• Un bloque try-catch que intente crear una matriz con dimensiones inválidas (ej.
negativas).
• Un bloque try-catch que, sobre una matriz válida, intente usar setRowCol con
un índice de fila incorrecto.
• Un bloque try-catch que intente usar getRowCol con un índice de columna
incorrecto.
• Imprime mensajes descriptivos en la consola para indicar qué prueba se está
realizando y qué excepción se capturó.

# 5. Criterios de Evaluación
• Correctitud: El código debe compilar sin errores y el comportamiento debe ser el esperado
según las consignas.
• Programación Defensiva: Correcta implementación de validaciones proactivas en todos los
métodos públicos que alteran o consultan el estado.
• Manejo de Excepciones: Uso adecuado de throw y throws, y correcta definición y uso
de la excepción personalizada MatrizException.
• Calidad del Código: Eliminación de anti-patrones, uso de constantes para códigos de error
y claridad general del código.
• Pruebas: La clase App debe demostrar que todas las condiciones de error implementadas
son probadas y manejadas correctamente.