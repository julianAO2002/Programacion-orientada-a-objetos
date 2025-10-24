import java.util.*;
import java.util.stream.Collectors;

public class ProductoService {
	
	private List<Producto> productos;

    public ProductoService(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	// Tarea 1: Filtrar productos por categoría
    public List<Producto> obtenerProductosPorCategoria(String categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }

    // Tarea 2: Encontrar el producto más caro
    public Optional<Producto> encontrarProductoMasCaro() {
        return productos.stream()
                .max(Comparator.comparing(Producto::getPrecio));
    }

    // Tarea 3: Obtener nombres de productos con poco stock
    public List<String> obtenerNombresProductosConPocoStock(int stockMinimo) {
        return productos.stream()
                .filter(p -> p.getStock() < stockMinimo)
                .map(Producto::getNombre)
                .collect(Collectors.toList());
    }

    // Tarea 4: Ordenar productos por categoría y luego por precio descendente
    public List<Producto> ordenarProductosPorCategoriaYPrecio() {
        return productos.stream()
                .sorted(
                    Comparator.comparing(Producto::getCategoria)
                        .thenComparing(Comparator.comparing(Producto::getPrecio).reversed())
                )
                .collect(Collectors.toList());
    }

    // Tarea 5: Agrupar productos por categoría
    public Map<String, List<Producto>> agruparProductosPorCategoria() {
        return productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria));
    }

    // Tarea 6: Calcular el valor total del inventario
    public double calcularValorTotalInventario() {
        return productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getStock())
                .sum();
    }

    // Tarea 7: Ordenar usando un Comparator explícito y reutilizable
    public List<Producto> obtenerProductosOrdenadosPorStockYNombre() {
        Comparator<Producto> comparator = Comparator.comparingInt(Producto::getStock)
                .thenComparing(Producto::getNombre);
        return productos.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
    
    // Tarea 8: Búsqueda que devuelve un Optional para manejo avanzado
    public Optional<Producto> buscarProductoPorNombre(String nombre) {
        return productos.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }
}