public class Prueba {
    private String etiqueta;

    @Override
    public String toString() {
        return etiqueta;
    }

    public Prueba(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
}
