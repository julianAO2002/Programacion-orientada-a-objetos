package ej6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEmpleados listaEmpleados = new ListaEmpleados();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Ver empleado que más gana");
            System.out.println("3. Ver sueldo promedio");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Sueldo del empleado: ");
                    double sueldo = scanner.nextDouble();
                    listaEmpleados.registrarEmpleado(nombre, sueldo);                    
                    break;

                case 2:
                    Empleado mejor = listaEmpleados.empleadoQueMasGana();
                    if (mejor != null) {
                        System.out.println("Empleado que más gana: " + mejor.getNombre() + ": $" + mejor.getSueldo());
                    } else {
                        System.out.println("No hay empleados registrados.");
                    }
                    break;

                case 3:
                    double promedio = listaEmpleados.sueldoPromedio();
                    System.out.println("Sueldo promedio: $" + promedio);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

