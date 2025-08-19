public class Cuadrado extends Rectangulo {

    public Cuadrado(String color, CoordenadasAlCentro centro, String nombre, int lado) {
        super(color, centro, nombre, lado, lado);
    }

    @Override
    public void setLado_mayor(Integer lado_mayor) {        
        super.setLado_mayor(lado_mayor);
        super.setLado_menor(lado_mayor);
    }

    @Override
    public void setLado_menor(Integer lado_menor) {        
        super.setLado_menor(lado_menor);
        super.setLado_mayor(lado_menor);
    }

    @Override
    public String toString() {
        return "Cuadrado ["+ this.getNombre_de_la_forma()+
        "] [lado_mayor=" + this.getLado_mayor() + 
        ", lado_menor=" + this.getLado_menor() +
         "]\n Area :" + calcularArea() + "\n";
    }

    @Override
    public void mover(CoordenadasAlCentro nuevaPosicion) {
        setPosicion(nuevaPosicion);
    }


}

