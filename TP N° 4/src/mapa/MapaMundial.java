package mapa;

import java.util.HashSet;
import java.util.Set;

public class MapaMundial {
    public Set<Continente> getContinentes() {
        return continentes;
    }

    public java.util.List<Pais> getTodosLosPaises() {
        java.util.List<Pais> lista = new java.util.ArrayList<>();
        for (Continente continente : continentes) {
            lista.addAll(continente.getPaises());
        }
        return lista;
    }

    public Pais buscarPaisPorNombre(String nombre) {
        for (Continente continente : continentes) {
            for (Pais pais : continente.getPaises()) {
                if (pais.getNombre().equalsIgnoreCase(nombre)) {
                    return pais;
                }
            }
        }
        return null;
    }
    
    private Set<Continente> continentes;
    
    public MapaMundial() {
        continentes = new HashSet<>();
        inicializarContinentesYPaises();
    }

    // Inicializamos continentes, países y provincias
    private void inicializarContinentesYPaises() {        
        Continente america = new Continente("America");
        Continente europa = new Continente("Europa");
        Continente asia = new Continente("Asia");
        Continente africa = new Continente("Africa");
        Continente oceania = new Continente("Oceania");
        Continente antartida = new Continente("Antartida");

        // Crear países y asignar a los continentes
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780000);
        argentina.addProvincia(new Provincia("Entre Rios"));
        argentina.addProvincia(new Provincia("Buenos Aires"));
        argentina.addProvincia(new Provincia("Santa Fe"));
        argentina.addProvincia(new Provincia("Corrientes"));
        argentina.addProvincia(new Provincia("Cordoba"));
        america.agregarPais(argentina);

        Pais uruguay = new Pais("Uruguay", "Montevideo", 176215);
        uruguay.addProvincia(new Provincia("Salto"));
        uruguay.addProvincia(new Provincia("Paysandu"));
        uruguay.addProvincia(new Provincia("Canelones"));
        uruguay.addProvincia(new Provincia("Rocha"));
        america.agregarPais(uruguay);

        Pais brasil = new Pais("Brasil", "Brasilia", 8515767);
        america.agregarPais(brasil);

        Pais chile = new Pais("Chile", "Santiago", 756102);

        america.agregarPais(chile);

        Pais paraguay = new Pais("Paraguay", "Asuncion", 406750);
        america.agregarPais(paraguay);

        Pais bolivia = new Pais("Bolivia", "Sucre", 1098581);
        america.agregarPais(bolivia);

        Pais espana = new Pais("Espana", "Madrid", 505992);
        europa.agregarPais(espana);

        Pais francia = new Pais("Francia", "Paris", 643801);
        europa.agregarPais(francia);

        Pais italia = new Pais("Italia", "Roma", 301340);
        europa.agregarPais(italia);

        Pais portugal = new Pais("Portugal", "Lisboa", 92212);
        europa.agregarPais(portugal);

        Pais alemania = new Pais("Alemania", "Berlin", 357386);
        europa.agregarPais(alemania);

        Pais suiza = new Pais("Suiza", "Berna", 41285);
        europa.agregarPais(suiza);

        Pais austria = new Pais("Austria", "Viena", 83879);
        europa.agregarPais(austria);

        // Agregar continentes al mapa
        continentes.add(america);
        continentes.add(europa);
        continentes.add(asia);
        continentes.add(africa);
        continentes.add(oceania);
        continentes.add(antartida);

        // Limítrofes de Argentina
        argentina.agregarLimitrofe(uruguay);
        argentina.agregarLimitrofe(brasil);
        argentina.agregarLimitrofe(chile);
        argentina.agregarLimitrofe(paraguay);
        argentina.agregarLimitrofe(bolivia);

        // Limítrofes de Uruguay
        uruguay.agregarLimitrofe(argentina);
        uruguay.agregarLimitrofe(brasil);

        // Limítrofes de Brasil
        brasil.agregarLimitrofe(argentina);
        brasil.agregarLimitrofe(uruguay);
        brasil.agregarLimitrofe(paraguay);
        brasil.agregarLimitrofe(bolivia);

        // Limítrofes de Chile
        chile.agregarLimitrofe(argentina);
        chile.agregarLimitrofe(bolivia);

        // Limítrofes de Paraguay
        paraguay.agregarLimitrofe(argentina);
        paraguay.agregarLimitrofe(brasil);
        paraguay.agregarLimitrofe(bolivia);

        // Limítrofes de Bolivia
        bolivia.agregarLimitrofe(argentina);
        bolivia.agregarLimitrofe(brasil);
        bolivia.agregarLimitrofe(chile);
        bolivia.agregarLimitrofe(paraguay);

        // Limítrofes de España
        espana.agregarLimitrofe(francia);
        espana.agregarLimitrofe(portugal);

        // Limítrofes de Francia
        francia.agregarLimitrofe(espana);
        francia.agregarLimitrofe(italia);
        francia.agregarLimitrofe(alemania);
        francia.agregarLimitrofe(suiza);
        francia.agregarLimitrofe(austria);

        // Limítrofes de Italia
        italia.agregarLimitrofe(francia);
        italia.agregarLimitrofe(suiza);
        italia.agregarLimitrofe(austria);

        // Limítrofes de Portugal
        portugal.agregarLimitrofe(espana);

        // Limítrofes de Alemania
        alemania.agregarLimitrofe(francia);
        alemania.agregarLimitrofe(suiza);
        alemania.agregarLimitrofe(austria);

        // Limítrofes de Suiza
        suiza.agregarLimitrofe(francia);
        suiza.agregarLimitrofe(italia);
        suiza.agregarLimitrofe(alemania);
        suiza.agregarLimitrofe(austria);

        // Limítrofes de Austria
        austria.agregarLimitrofe(francia);
        austria.agregarLimitrofe(italia);
        austria.agregarLimitrofe(alemania);
        austria.agregarLimitrofe(suiza);
    }

    public Set<Pais> getPaises(String continenteNombre) {
        for (Continente continente : continentes) {
            if (continente.getNombre().equalsIgnoreCase(continenteNombre)) {
                return new HashSet<>(continente.getPaises());
            }
        }
        return new HashSet<>();  // Retorna un Set vacio si no se encuentra el continente
    }
    
    public Set<Provincia> getProvincias(String paisNombre) {
        for (Continente continente : continentes) {
            for (Pais pais : continente.getPaises()) {
                if (pais.getNombre().equalsIgnoreCase(paisNombre)) {
                    return new HashSet<>(pais.getProvincias());
                }
            }
        }
        return new HashSet<>();  
    }

    public java.util.Set<Pais> getLimitrofes(String paisNombre) {
        Pais pais = buscarPaisPorNombre(paisNombre);
        if (pais != null) {
            return pais.getLimitrofes();
        }
        return new java.util.HashSet<>();
    }
}
