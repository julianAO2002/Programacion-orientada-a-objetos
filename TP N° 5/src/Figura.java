public abstract class Figura {
    private String color;
    private CoordenadasAlCentro posicion;
    private String nombre_de_la_forma;
    
    public Figura(String color, CoordenadasAlCentro centro, String nombre_de_la_forma) {
        this.color = color;
        this.posicion = centro;
        this.nombre_de_la_forma = nombre_de_la_forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CoordenadasAlCentro getPosicion() {
        return posicion;
    }

    public void setPosicion(CoordenadasAlCentro centro) {
        this.posicion = centro;
    }

    public String getNombre_de_la_forma() {
        return nombre_de_la_forma;
    }

    public void setNombre_de_la_forma(String nombre_de_la_forma) {
        this.nombre_de_la_forma = nombre_de_la_forma;
    }

    @Override
    public String toString() {
        return "Figura [color=" + color + ", centro=" + posicion + ", nombre_de_la_forma=" + nombre_de_la_forma + "]" + "\n";
    }

    // Métodos abstractos 
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
