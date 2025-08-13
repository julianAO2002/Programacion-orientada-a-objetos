/*
 * --acomode los mensajes de error
 * --puse los public static final para q no me salte el error de los nros magicos
 
 */


//los public static final akiii
public class MatrizException extends Exception {
    public static final int ERR_COLUMNAS_EXCEDIDAS = 0;
    public static final int ERR_FILAS_EXCEDIDAS = 1;
    public static final int ERR_DIMENSIONES_NEGATIVAS = 2;
    public static final int ERR_FILA_FUERA_DE_RANGO = 3;
    public static final int ERR_COLUMNA_FUERA_DE_RANGO = 4;
// los msj de errores aka<3
    private static final String[] ERRORES = {
        "El número de columnas excede el máximo permitido.",
        "El número de filas excede el máximo permitido.",
        "Las dimensiones de la matriz no pueden ser negativas.",
        "El índice de la fila está fuera de rango.",
        "El índice de la columna está fuera de rango."
    };

    private String name;

    public MatrizException(String nom) {name = nom;}

    public MatrizException(int numError) {name = ERRORES[numError];}

    public String toString() {return "ERROR MATRIZ: " + name;}
}
