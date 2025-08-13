import java.util.ArrayList;

public class Vector {
    private ArrayList<Object> elementos;

    public Vector(int capacidadInicial) {
        elementos = new ArrayList<>(capacidadInicial);
    }

    public void add(int index, Object obj) {
        // Asegura que la lista tenga el tamaño suficiente
        while (elementos.size() <= index) {
            elementos.add(null);
        }
        elementos.set(index, obj);
    }

    public Object elementAt(int index) {
        return elementos.get(index);
    }

    public int size() {
        return elementos.size();
    }
}