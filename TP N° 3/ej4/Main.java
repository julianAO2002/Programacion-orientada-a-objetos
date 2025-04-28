package ej4;

import java.util.Arrays;


public class Main{
    public static void main(String[] args) {      
        
        ArrayEntero listaNum = new ArrayEntero();
    
        System.out.println(listaNum.cantidadNumeros());
        System.out.println(listaNum.mayor());
        System.out.println(listaNum.promedio());
        System.out.println(Arrays.toString(listaNum.ordenAscendente()));
        System.out.println(Arrays.toString(listaNum.ordenDescendente()));
    }
}
