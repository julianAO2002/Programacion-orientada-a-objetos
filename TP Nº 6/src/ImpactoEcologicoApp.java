import java.util.ArrayList;

public class ImpactoEcologicoApp {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

        objetos.add(new Edificio("Edificio Central", 20000));
        objetos.add(new Auto("Toyota Corolla", 15000, 0.07));
        objetos.add(new Bicicleta("Montaña"));

        for (ImpactoEcologico obj : objetos) {
            System.out.println(obj.toString());
            System.out.println("Impacto ecológico (kg CO2/año): " + obj.obtenerImpactoEcologico());
            System.out.println("----------------------------------");
        }
    }
}