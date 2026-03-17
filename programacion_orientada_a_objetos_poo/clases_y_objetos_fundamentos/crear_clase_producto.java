package clases_y_objetos_fundamentos;
class Producto {
    String nombre;
    double precio;
    int stock;
}
public class crear_clase_producto {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "camiseta";
        producto1.precio = 29.99;
        producto1.stock = 50;
        System.out.println("nombre del producto: " + producto1.nombre);
        System.out.println("precio: $" + producto1.precio);
        System.out.println("stock disponible: " + producto1.stock);
    }
}