# Trabajo Práctico 4 – Java: Mapa Mundial

## 1. Requisitos del ejercicio

Crear una aplicación que represente el mapa del mundo, con las siguientes características:

### Clases y atributos

- **País**
  - Atributos: nombre, capital, superficie (en km²), continente al que pertenece.
  - Un país está compuesto por provincias.

- **Continente**
  - Atributos: nombre.
  - Está compuesto por países.
  - *Nota:* Un país solo pertenece a un continente.

- **Provincia**
  - Atributos: nombre.

### Métodos requeridos

Cada clase debe tener:

- Constructores para crear e inicializar objetos.
  - Por ejemplo: un continente crea sus países, un país crea sus provincias.
- Métodos `get` y `set` para acceder y modificar los atributos.
- Método para devolver los países de un continente.
- Método para devolver las provincias de un país.
- Sobrescritura de `toString()` para mostrar como cadena de texto cada objeto.

## Clase `MapaMundial`

Debe:

- Instanciar e inicializar los continentes:
  - América, Europa, Asia, África, Oceanía y Antártida.
- Instanciar e inicializar los países:
  - Argentina, Uruguay, Brasil, Chile, Paraguay, Bolivia, España, Francia, Italia, Portugal.
  - Vincular cada país con su continente.
- Instanciar e inicializar las provincias:
  - Entre Ríos, Buenos Aires, Santa Fe, Corrientes, Córdoba, Salto, Paysandú, Canelones, Rocha, Maldonado.
  - Vincular cada provincia con su país.

### Métodos adicionales en `MapaMundial`

- `getPaises(String continente)`: devuelve un `Set` de países pertenecientes al continente indicado.
- `getProvincias(String pais)`: devuelve un `Set` de provincias pertenecientes al país indicado.

## Clase `MapaMundi` (o `MapaMundiController`)

Debe permitir:

1. Ingresar el nombre de un continente y listar en pantalla los países de ese continente.
2. Ingresar el nombre de un país y listar en pantalla las provincias de ese país.
3. Devolver los países ordenados por superficie.
4. Comparar 2 países y devolver cuál es más grande en superficie.

> Esta clase debe contener el método `main` para ejecutar la aplicación.

## Diagrama de clases

## Diagrama de Clases

- **MapaMundial**
  - continentes: Set<Continente>
  - Métodos:
    - getPaises(continenteNombre)
    - getProvincias(paisNombre)
    - getTodosLosPaises()
    - buscarPaisPorNombre(nombre)

    |
    |-- contiene --> *Continente*

- **Continente**
  - nombre: String
  - paises: List<Pais>
  - Métodos:
    - agregarPais(Pais)
    - getPaises()
    - getNombre()

    |
    |-- contiene --> *Pais*

- **Pais**
  - nombre: String
  - capital: String
  - superficie: Integer
  - provincias: List<Provincia>
  - Métodos:
    - addProvincia(Provincia)
    - getProvincias()
    - getNombre()
    - getSuperficie()

    |
    |-- contiene --> *Provincia*

- **Provincia**
  - nombre: String
  - Métodos:
    - getNombre()

---

## 2. Extensión del ejercicio

Agregar soporte para países **limítrofes**:

- Un país debe tener una operación que devuelva cuáles son sus países limítrofes.

### Cambios requeridos

- En la clase `País`:
  - Agregar relación con otros países (lista de países limítrofes).

- En la clase `MapaMundial`:
  - Inicializar los países limítrofes entre los países ya creados.
  - Agregar método:

```java
List<Pais> getLimitrofes(String nombrePais)
