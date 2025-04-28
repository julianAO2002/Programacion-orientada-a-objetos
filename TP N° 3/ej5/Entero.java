package ej5;

public class Entero {
    private int numero;

    //constructor de la clase Enteros
    public Entero(int numero) {
    super();
    this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //calcula el cuadrado de n
    public long cuadrado(){
        return numero*numero;
    }
    public boolean esPar() {
        return numero % 2 == 0;
    }
    public boolean esImpar() {
        return numero % 2 == 1;
    }
    public long factorial() {
        if (numero < 0) return -1; 
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public boolean esPrimo() {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) { 
            if (numero % i == 0) return false;
        }
        return true;
    }

    }
    