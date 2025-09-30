public class App {
    public static void main(String[] args) {
        Prueba objpPrueba = new Prueba("prueba");
        Caja<Integer> cajaInt = new Caja<>(123, "Números", 1);
        Caja<String> cajaStr = new Caja<>("Hola", "Saludo", 2);
        Caja<Prueba> cajaPrueba = new Caja<>(objpPrueba, "prueba", 3);

        System.out.println(cajaPrueba.getContenido());
        System.out.println(cajaInt.getContenido());
        mostrarContenido(cajaPrueba);
        mostrarContenido(cajaInt);
        mostrarContenido(cajaStr);
    }

    public static <T> void mostrarContenido(Caja<T> caja) {
        System.out.println("Contenido de la caja: " + caja.getContenido());
    }
}
