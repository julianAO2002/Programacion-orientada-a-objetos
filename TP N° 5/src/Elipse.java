public class Elipse extends Figura {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, CoordenadasAlCentro centro, String nombre, double radioMayor, double radioMenor) {
        super(color, centro, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }
    @Override
    // Método para calcular el área: π * R * r
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }
    @Override
    // Método para calcular el perímetro 
    public double calcularPerimetro() {
        return Math.PI * (3 * (radioMayor + radioMenor) - 
               Math.sqrt((3 * radioMayor + radioMenor) * (radioMayor + 3 * radioMenor)));
    }

    // Escalar ambos radios
    public void escalar(double factor) {
        if (factor <= 0) {
            System.out.println("⚠️ Error: el factor de escala debe ser mayor que cero.");
            return;
        }
        this.radioMayor *= factor;
        this.radioMenor *= factor;
    }

    @Override
    public String toString() {
        return "Elipse [" + getNombre_de_la_forma() + "] de color " + getColor() +
               ", centro en (" + getPosicion().getEje_x() + ", " + getPosicion().getEje_y() + ")" +
               ", radio mayor: " + radioMayor +
               ", radio menor: " + radioMenor+ 
                "\n" ;
               
    }
    @Override
    public void mover(CoordenadasAlCentro nuevaPosicion) {
        setPosicion(nuevaPosicion);
    }
}
