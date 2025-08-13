



public class MatrizException extends Exception {
    private static String Errores[] = { "Excede las columnas", "Excede las filas" };
    private String name;

    public MatrizException(String nom) {
        name = nom;
    }

    public MatrizException(int numError) {
        name = Errores[numError];
    }

    public String toString() {
        return "ERROR MATRIZ :" + name;
    }
}
