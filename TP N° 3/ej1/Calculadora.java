package ej1;

public class Calculadora {
    private double num1;
    private double num2;
    private double num3;

    public Calculadora(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double calcularResultado() {
        if (num1 > 0) {
            return num2 * num3;
        } else {
            return num2 + num3;
        }
    }
}