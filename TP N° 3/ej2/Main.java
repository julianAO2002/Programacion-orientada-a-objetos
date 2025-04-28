package ej2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {        

        Scanner scanner = new Scanner(System.in);        

        System.out.println("Ingrese la nota (de 1 a 10)");
        int nota = scanner.nextInt();       
        
        if (nota < 0 || nota > 10) {
            System.out.println("Calificación fuera de rango. Debe estar entre 0 y 10.");} 
        else if (nota >= 9) {
            System.out.println(ClasificacionNota.SOBRESALIENTE.getNombre());} 
        else if (nota >= 6) {
            System.out.println(ClasificacionNota.APROBADO.getNombre());} 
        else if (nota < 6) {
            System.out.println(ClasificacionNota.DESAPROBADO.getNombre());}        

        scanner.close();
    }

}