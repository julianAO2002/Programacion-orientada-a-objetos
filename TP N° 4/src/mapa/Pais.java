package mapa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pais {
    private String nombre;
    private String capital;
    private Integer superficie;
    private List<Provincia> provincias;
    private Set<Pais> limitrofes = new HashSet<>();

    public Pais(String nombre, String capital, Integer superficie) {
        this.nombre = nombre;
        this.capital = capital;
        this.superficie = superficie;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void addProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public void agregarLimitrofe(Pais pais) {
        limitrofes.add(pais);
    }

    public Set<Pais> getLimitrofes() {
        return limitrofes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" (Capital: ").append(capital)
          .append(", Superficie: ").append(superficie).append(" km²)\n");
        sb.append("  Provincias:\n");
        for (Provincia provincia : provincias) {
            sb.append("    - ").append(provincia).append("\n");
        }
        return sb.toString();
    }

}

