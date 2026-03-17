package atributos;
class Producto {
    double precio;
    int cantidad;
}
public class clase_producto_con_precio_y_cantidad {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.precio = 19.99;
        producto1.cantidad = 10;
        System.out.println("precio del producto: $" + producto1.precio);
        System.out.println("cantidad disponible: " + producto1.cantidad);
    }
}