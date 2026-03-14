package proyecto_modular_basico;
public class sistema_inventario_modular {
    public static void main(String[] args) {
        String nombreProducto = obtenerNombreProducto();
        int cantidadProducto = obtenerCantidadProducto();
        int precioProducto = obtenerPrecioProducto();
        int valorTotalInventario = calcularValorInventario(cantidadProducto, precioProducto);
        mostrarInventario(nombreProducto, cantidadProducto, precioProducto, valorTotalInventario);
    }
    public static String obtenerNombreProducto() {
        return "laptop";
    }
    public static int obtenerCantidadProducto() {
        return 10;
    }
    public static int obtenerPrecioProducto() {
        return 800;
    }
    public static int calcularValorInventario(int cantidad, int precio) {
        return cantidad * precio;
    }
    public static void mostrarInventario(String nombre, int cantidad, int precio, int valorTotal) {
        System.out.println("producto: " + nombre);
        System.out.println("cantidad disponible: " + cantidad);
        System.out.println("precio por unidad: $" + precio);
        System.out.println("valor total del inventario: $" + valorTotal);
    }
}