package ej5;

public class Main {
    public static void main(String[] args) {
        Entero e = new Entero(7);

        System.out.println("Número: " + e.getNumero());
        System.out.println("Cuadrado: " + e.cuadrado());
        System.out.println("¿Es par? " + e.esPar());
        System.out.println("¿Es impar? " + e.esImpar());
        System.out.println("Factorial: " + e.factorial());
        System.out.println("¿Es primo? " + e.esPrimo());
    }
}
