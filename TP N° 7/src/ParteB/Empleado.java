package ParteB;

public class Empleado {

    private String nombre;
    private Integer sueldo;
    private Integer legajo;
    
    public Empleado() {
        super();
    }

    public Empleado(String nombre, Integer sueldo) throws EmpleadoException {
        super();
        if (nombre == null || nombre.length() < 3) {
            throw new EmpleadoException(EmpleadoException.ERR_NOMBRE_INVALIDO);
        }
        if (sueldo == null || sueldo <= 0) {
            throw new EmpleadoException(EmpleadoException.ERR_SUELDO_INVALIDO);
        }
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre) {
        super();
        this.nombre = nombre;
    }

    public Empleado(Integer sueldo) {
        super();
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws EmpleadoException {
        if (nombre == null || nombre.length() < 3) {
            throw new EmpleadoException(EmpleadoException.ERR_NOMBRE_INVALIDO);
        }
        this.nombre = nombre;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) throws EmpleadoException {
        if (sueldo == null || sueldo <= 0) {
            throw new EmpleadoException(EmpleadoException.ERR_SUELDO_INVALIDO);
        }
        this.sueldo = sueldo;
    }
    
    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) throws EmpleadoException {
        if (legajo == null || legajo <= 0) {
            throw new EmpleadoException(EmpleadoException.ERR_LEGAJO_INVALIDO);
        }
        this.legajo = legajo;
    }
    
    public String getSueldoString() {
        return "$" + sueldo;
    }

    @Override
    public String toString() {
        return this.getNombre() + " - " + this.getSueldoString();
    }
}