public class Edificio implements ImpactoEcologico{    
    private String nombre;
    private double consumoEnergiaAnualkWh;

    public Edificio(String nombre, double consumoEnergiaAnualkWh) {
        this.nombre = nombre;
        this.consumoEnergiaAnualkWh = consumoEnergiaAnualkWh;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // 0.5 kg CO2 por kWh
        return consumoEnergiaAnualkWh * 0.5;
    }
    
    @Override
    public String toString() {
        return "Edificio: " + nombre;
    }

}
