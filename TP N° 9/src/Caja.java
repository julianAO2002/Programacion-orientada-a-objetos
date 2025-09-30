public class Caja<T> {
    private T contenido;
    private String etiqueta;
    private Integer id;

    public Caja(T contenido, String etiqueta, Integer id) {
        this.contenido = contenido;
        this.etiqueta = etiqueta;
        this.id = id;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}