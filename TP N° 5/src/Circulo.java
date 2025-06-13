public class Circulo extends Elipse {
    //recibe solo un radio y lo agrega a radio menor y radio mayor xq deben ser iguales 
    public Circulo(String color, CoordenadasAlCentro centro, String nombre, double radio) {
        super(color, centro, nombre, radio, radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRadioMayor(), 2); 
    }

    @Override
    public String toString() {
        return "Círculo [" + getNombre_de_la_forma() + "] de color " + getColor() +
               ", centro en (" + getPosicion().getEje_x() + ", " + getPosicion().getEje_y() + ")" +
               ", radio: " + getRadioMayor()
               + "\n Area :" + calcularArea() + "\n";
    }
}
