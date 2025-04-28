package ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double n3 = scanner.nextDouble();

        Calculadora calc = new Calculadora(n1, n2, n3);
        double resultado = calc.calcularResultado();

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}