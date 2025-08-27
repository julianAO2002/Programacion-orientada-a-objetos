import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpleadoService {

	private static List<Empleado> empleados = new ArrayList<Empleado>();

	private static int contadorLegajos = 1;
	public static Boolean agregar(Empleado empleado) throws EmpleadoException {
    	empleado.setLegajo(contadorLegajos++); // si es <=0 lanza la excepción
   		return empleados.add(empleado);
	}

	// Devuelve el empleado de mayor sueldo
	public static Empleado mayorSueldo() throws EmpleadoException {
    	if (empleados.isEmpty()) {
        	throw new EmpleadoException(EmpleadoException.ERR_COLLECTION_VACIA);
    	}

    	Empleado mayor = null;
    	for (Empleado empleado : empleados) {
        	if (mayor == null || mayor.getSueldo() <= empleado.getSueldo()) {
            	mayor = empleado;
        	}
   		}
    	return mayor;
	}
	public static double sueldoPromedio() throws EmpleadoException {
		if (empleados.isEmpty()) {
        	throw new EmpleadoException(EmpleadoException.ERR_COLLECTION_VACIA);
    	}
		Double total = 0.0;
		for (Empleado empleado : empleados) {
			total += empleado.getSueldo();
		}
		return total / empleados.size();
	}


	public static void eliminar(String nombre) throws EmpleadoException {
    	if (empleados.isEmpty()) {
        	throw new EmpleadoException(EmpleadoException.ERR_COLLECTION_VACIA);
    	}

    	Iterator<Empleado> iterador = empleados.iterator();
    	boolean encontrado = false;

    	while (iterador.hasNext()) {
        	Empleado empl = iterador.next();
       		if (empl.getNombre().equalsIgnoreCase(nombre)) {
            	iterador.remove();
            	encontrado = true;
        	}
    	}

    	if (!encontrado) {
        	throw new EmpleadoException(EmpleadoException.ERR_EMPLEADO_NO_ENCONTRADO);
    	}
	}


	public static List<Empleado> getEmpleados() {		
		return empleados;
	}

}
