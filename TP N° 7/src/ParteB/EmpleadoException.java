package ParteB;

public class EmpleadoException extends Exception {
    private int codigo;
    private static final String[] MENSAJES = {
        "Error desconocido",
        "El nombre del empleado debe tener 3 o mas caracteres.",
        "El sueldo del empleado debe ser mayor a 0.",
        "El legajo del empleado debe ser mayor a 0.",
        "No hay empleados.",
        "No se encontro el empleado."
    };

    public static final int ERR_NOMBRE_INVALIDO = 1;
    public static final int ERR_SUELDO_INVALIDO = 2;
    public static final int ERR_LEGAJO_INVALIDO = 3;
    public static final int ERR_COLLECTION_VACIA = 4;
    public static final int ERR_EMPLEADO_NO_ENCONTRADO = 5;

    public EmpleadoException(int codigo) {
        super(MENSAJES[codigo]);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}