

public class Rectangulo extends Figura {
    private Integer lado_mayor;
    private Integer lado_menor;

    public Rectangulo(String color, CoordenadasAlCentro centro, String nombre_de_la_forma, Integer lado_menor, Integer lado_mayor) {
        super(color, centro, nombre_de_la_forma);
        this.lado_mayor = lado_mayor;
        this.lado_menor = lado_menor;        
    }

    public Integer getLado_mayor() {
        return lado_mayor;
    }

    public void setLado_mayor(Integer lado_mayor) {
        this.lado_mayor = lado_mayor;
    }

    public Integer getLado_menor() {
        return lado_menor;
    }

    public void setLado_menor(Integer lado_menor) {
        this.lado_menor = lado_menor;
    }      

    public void escalar(double factor) {
    if (factor <= 0) {
        System.out.println("Error: el factor de escala debe ser mayor que cero.");
        return;
        }

    this.lado_mayor = (int)(this.lado_mayor * factor);
    this.lado_menor = (int)(this.lado_menor * factor);
    }


    @Override
    public String toString() {
        return "Rectangulo ["+ this.getNombre_de_la_forma()+"] [lado_mayor=" + this.getLado_mayor() + ", lado_menor=" + this.getLado_menor() + "]\n Area :" + calcularArea()+ "\n";
    }

    @Override
    public double calcularArea() {        
        return lado_menor*lado_mayor;
    }

    @Override
    public double calcularPerimetro() {        
        return (lado_menor*2)+(lado_mayor*2);
    }

}
