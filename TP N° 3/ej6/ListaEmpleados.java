package ej6;

import java.util.ArrayList;

public class ListaEmpleados {    
    private ArrayList<Empleado> empleados;

    public  ListaEmpleados() {
        empleados = new ArrayList<>();
    }
    
    public void registrarEmpleado(String nombre, double sueldo) {
        empleados.add(new Empleado(nombre, sueldo));
        System.out.println("Empleado Registrado");
    }
    
    public Empleado empleadoQueMasGana() {
        if (empleados.isEmpty())
        return null;

        Empleado max = empleados.get(0);
        for (Empleado e : empleados) {
            if (e.getSueldo() > max.getSueldo()) {
                max = e;
            }
        }
        return max;
    }
    
    public double sueldoPromedio() {
        if (empleados.isEmpty()) 
        return 0;

        double total = 0;
        for (Empleado e : empleados) {
            total += e.getSueldo();
        }
        return total / empleados.size();
    }

}
