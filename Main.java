import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Buscar producto por código");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese código: ");
                        int codigo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese cantidad: ");
                        int cantidad = scanner.nextInt();

                        Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidad);
                        inventario.agregarProducto(nuevoProducto);
                        break;

                    case 2:
                        inventario.mostrarInventario();
                        break;

                    case 3:
                        System.out.print("Ingrese el código a buscar: ");
                        int codigoBusqueda = scanner.nextInt();
                        Producto encontrado = inventario.buscarProducto(codigoBusqueda);
                        if (encontrado != null) {
                            System.out.println("\n¡Producto encontrado!");
                            encontrado.mostrarInformacion();
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar entrada incorrecta
            }

        } while (opcion != 4);

        scanner.close();
    }
} 