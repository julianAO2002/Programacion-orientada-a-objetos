package mapa;

import java.util.HashSet;
import java.util.Set;

public class MapaMundial {
    
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

        // Agregar continentes al mapa
        continentes.add(america);
        continentes.add(europa);
        continentes.add(asia);
        continentes.add(africa);
        continentes.add(oceania);
        continentes.add(antartida);
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
}
