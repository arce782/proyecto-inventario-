import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProductos;

    // Constructor
    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    // Método para agregar un producto
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("¡Producto agregado con éxito!");
    }

    // Método para listar todos los productos
    public void mostrarInventario() {
        if (listaProductos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("\n--- LISTA DE PRODUCTOS EN EL INVENTARIO ---");
            for (Producto p : listaProductos) {
                p.mostrarInformacion();
                System.out.println("----------------------------------------");
            }
        }
    }

    // Método para buscar un producto por su código
    public Producto buscarProducto(int codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null; // Si no lo encuentra
    }
}