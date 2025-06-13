import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
    ArrayList<Figura> figuras = new ArrayList<>();
    figuras.add(new Circulo("Rojo", new CoordenadasAlCentro(0, 0), "MiCírculo", 5.0));
    figuras.add(new Rectangulo("Azul", new CoordenadasAlCentro(2, 2), "MiRectángulo", 4, 6));
    figuras.add(new Elipse("Verde", new CoordenadasAlCentro(3, 3), "MiElipse", 4, 2));
    figuras.add(new Cuadrado("Naranja", new CoordenadasAlCentro(4, 4), "MiCuadrado", 5));

    for (Figura figura : figuras) {
        System.out.println(figura);  // Llama a toString() de cada figura
    }

    }
}
