package mapa;


public class App {
    public static void main(String[] args) throws Exception {
        MapaMundial mapa = new MapaMundial();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Listar países de un continente");
            System.out.println("2. Listar provincias de un país");
            System.out.println("3. Listar países ordenados por superficie");
            System.out.println("4. Comparar dos países por superficie");
            System.out.println("5. Listar países limítrofes de un país");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());
            if (opcion == 0) break;
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del continente: ");
                    String nombreContinente = scanner.nextLine();
                    var paises = mapa.getPaises(nombreContinente);
                    if (paises.isEmpty()) {
                        System.out.println("No se encontró el continente.");
                    } else {
                        System.out.println("Países de " + nombreContinente + ":");
                        for (var pais : paises) {
                            System.out.println("- " + pais.getNombre());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del país: ");
                    String nombrePais = scanner.nextLine();
                    var provincias = mapa.getProvincias(nombrePais);
                    if (provincias.isEmpty()) {
                        System.out.println("No se encontró el país o no tiene provincias.");
                    } else {
                        System.out.println("Provincias de " + nombrePais + ":");
                        for (var provincia : provincias) {
                            System.out.println("- " + provincia.getNombre());
                        }
                    }
                    break;
                case 3:
                    java.util.List<mapa.Pais> todosPaises = mapa.getTodosLosPaises();
                    todosPaises.sort((a, b) -> b.getSuperficie().compareTo(a.getSuperficie()));
                    System.out.println("Países ordenados por superficie:");
                    for (var pais : todosPaises) {
                        System.out.println(pais.getNombre() + " - " + pais.getSuperficie() + " km2");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del primer país: ");
                    String pais1 = scanner.nextLine();
                    System.out.print("Ingrese el nombre del segundo país: ");
                    String pais2 = scanner.nextLine();
                    mapa.Pais p1 = mapa.buscarPaisPorNombre(pais1);
                    mapa.Pais p2 = mapa.buscarPaisPorNombre(pais2);
                    if (p1 == null || p2 == null) {
                        System.out.println("No se encontró uno o ambos países.");
                    } else {
                        if (p1.getSuperficie() > p2.getSuperficie()) {
                            System.out.println(p1.getNombre() + " es más grande que " + p2.getNombre());
                        } else if (p1.getSuperficie() < p2.getSuperficie()) {
                            System.out.println(p2.getNombre() + " es más grande que " + p1.getNombre());
                        } else {
                            System.out.println("Ambos países tienen la misma superficie.");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del país: ");
                    String nombreLimite = scanner.nextLine();
                    var limitrofes = mapa.getLimitrofes(nombreLimite);
                    if (limitrofes.isEmpty()) {
                        System.out.println("No se encontró el país o no tiene países limítrofes.");
                    } else {
                        System.out.println("Países limítrofes de " + nombreLimite + ":");
                        for (var lim : limitrofes) {
                            System.out.println("- " + lim.getNombre());
                        }
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}

