package constructores;
class Producto {
    String nombre;
    double precio;
    int cantidad;
    Producto() {
        this.nombre = "sin nombre";
        this.precio = 0.0;
        this.cantidad = 0;
        System.out.println("se ha creado un producto con constructor vacio.");
    }
    Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
        this.cantidad = 0;
        System.out.println("se ha creado un producto con nombre.");
    }
    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        System.out.println("se ha creado un producto con todos los atributos.");
    }
}
public class crear_clase_con_multiples_constructores {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto("camiseta");
        Producto producto3 = new Producto("pantalon", 59.99, 10);
        System.out.println("\n producto 1: " + producto1.nombre + " - $" + producto1.precio + " - cantidad: " + producto1.cantidad);
        System.out.println("producto 2: " + producto2.nombre + " - $" + producto2.precio + " - cantidad: " + producto2.cantidad);
        System.out.println("producto 3: " + producto3.nombre + " - $" + producto3.precio + " - cantidad: " + producto3.cantidad);
    }
}