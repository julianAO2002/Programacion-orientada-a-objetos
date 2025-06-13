package mapa;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nombre;
    private List<Pais> paises;

    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Continente: " + nombre + "\n");
        for (Pais pais : paises) {
            sb.append("  - ").append(pais).append("\n");
        }
        return sb.toString();
    }    
        
}
