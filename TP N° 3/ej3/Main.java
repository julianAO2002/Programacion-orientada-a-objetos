package ej3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabraIngresada = scanner.nextLine();

        Palabra palabra = new Palabra(palabraIngresada);

        if (palabra.esPalindromo()) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

        scanner.close();
    }
}
