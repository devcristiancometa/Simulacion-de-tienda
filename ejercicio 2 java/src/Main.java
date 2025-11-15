//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] productos = {"arroz", "pasta", "frijoles", "lentejas", "maiz", "leche"};

        // Mostrar la lista completa de productos
        System.out.println("Lista de productos disponibles:");
        for (String producto : productos) {
            System.out.println(producto);
        }

        // Buscar un producto por su nombre
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String productoABuscar = System.console().readLine();
        boolean encontrado = false;
        for (String producto : productos) {
            if (producto.equalsIgnoreCase(productoABuscar)) {
                System.out.println("El producto '" + productoABuscar + "' está disponible.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El producto '" + productoABuscar + "' no está disponible.");
        }

        // Simular la eliminación de un producto
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String productoAEliminar = System.console().readLine();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(productoAEliminar)) {
                productos[i] = "Agotado";
                System.out.println("El producto '" + productoAEliminar + "' ha sido marcado como 'Agotado'.");
                break;
            }
        }
    }
}