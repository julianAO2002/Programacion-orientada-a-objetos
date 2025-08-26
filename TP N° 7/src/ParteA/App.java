package ParteA;
// Clase App.java (Prueba)
public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando pruebas de MatrizObjetos...\n");

        // Test 1: Crear matriz con dimensiones negativas
        System.out.println("Test 1: Intentando crear matriz con dimensiones negativas");
        try {
            MatrizObjetos matriz = new MatrizObjetos(-1, 5);
        } catch (MatrizException e) {
            System.out.println("Error capturado (como se esperaba): " + e.getMessage());
        }

        // Test 2: Acceder a fila inválida
        System.out.println("\nTest 2: Intentando acceder a fila fuera de rango");
        try {
            MatrizObjetos matriz = new MatrizObjetos(5, 5);
            matriz.SetRowCol(201, 1, "test");
        } catch (MatrizException e) {
            System.out.println("Error capturado (como se esperaba): " + e.getMessage());
        }

        // Test 3: Acceder a columna inválida
        System.out.println("\nTest 3: Intentando acceder a columna fuera de rango");
        try {
            MatrizObjetos matriz = new MatrizObjetos(5, 5);
            Object obj = matriz.GetRowCol(0, 201);
        } catch (MatrizException e) {
            System.out.println("Error capturado (como se esperaba): " + e.getMessage());
        }

        // Test 4: Operación válida (caso de éxito)
        System.out.println("\nTest 4: Realizando operación válida");
        try {
            MatrizObjetos matriz = new MatrizObjetos(3, 3);
            matriz.SetRowCol(0, 0, "Valor insertado");
            Object resultado = matriz.GetRowCol(0, 0);
            System.out.println("Operación exitosa: " + resultado);
        } catch (MatrizException e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}