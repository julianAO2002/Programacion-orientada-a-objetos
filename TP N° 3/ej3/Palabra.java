package ej3;

public class Palabra {
    private String texto;

    public Palabra(String texto) {
        this.texto = texto;
    }

    public boolean esPalindromo() {
        String invertida = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertida);
    }
}