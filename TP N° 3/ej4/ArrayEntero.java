package ej4;


import java.util.Arrays;

public class ArrayEntero {
    private int[] numeros = {4, 2, 3, 8, 1};

    
    public int cantidadNumeros() {
        return numeros.length;
    }

    public int mayor() {
        int max = numeros[0];
        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double promedio() {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }

    public int[] ordenAscendente() {
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copia);
        return copia;
    }
    //se intercambian posiciones del primero y ultimo
    public int[] ordenDescendente() {
        int[] copia = ordenAscendente(); //copia y los ordena 
        for (int i = 0; i < copia.length / 2; i++) {
            int temp = copia[i]; //guarda el primero
            copia[i] = copia[copia.length - 1 - i];//remplaza el primero por el ultimo
            copia[copia.length - 1 - i] = temp;
        }
        return copia;
    }

}