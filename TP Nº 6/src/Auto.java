public class Auto implements ImpactoEcologico {
    private String modelo;
    private double kmPorAño;
    private double consumoLitrosPorKm;

    public Auto(String modelo, double kmPorAño, double consumoLitrosPorKm) {
        this.modelo = modelo;
        this.kmPorAño = kmPorAño;
        this.consumoLitrosPorKm = consumoLitrosPorKm;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // CO2 x año=  2.3 kg CO2 por litro de nafta
        return kmPorAño * consumoLitrosPorKm * 2.3;        
    }
    
    @Override
    public String toString() {
        return "Auto: " + modelo;
    }

}
