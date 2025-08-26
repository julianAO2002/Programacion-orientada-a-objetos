package ParteA;
/*
 * --acomode los mensajes de error
 * --puse los public static final para q no me salte el error de los nros magicos
 
 */


//los public static final akiii
public class MatrizException extends Exception {
    private int codigo;
    private static final String[] MENSAJES = {
        "Error desconocido",
        "El número de columnas excede el máximo permitido (200)",
        "El número de filas excede el máximo permitido (200)",
        "Las dimensiones no pueden ser negativas",
        "Índice de fila fuera de rango",
        "Índice de columna fuera de rango"
    };

    public static final int ERR_COLUMNAS_EXCEDIDAS = 1;
    public static final int ERR_FILAS_EXCEDIDAS = 2;
    public static final int ERR_DIMENSIONES_NEGATIVAS = 3;
    public static final int ERR_FILA_FUERA_DE_RANGO = 4;
    public static final int ERR_COLUMNA_FUERA_DE_RANGO = 5;

    public MatrizException(int codigo) {
        super(MENSAJES[codigo]);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
