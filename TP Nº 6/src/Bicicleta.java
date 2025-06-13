class Bicicleta implements ImpactoEcologico {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // impacto cercano a cero
        return 0.01; 
    }
    @Override
    public String toString() {
        return "Bicicleta: " + tipo;
    }
}