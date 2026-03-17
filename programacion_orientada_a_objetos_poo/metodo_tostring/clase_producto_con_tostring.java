package metodo_tostring;
class Producto {
    String nombre;
    double precio;
    int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "producto: " + nombre + ", precio: $" + precio + ", stock: " + stock;
    }
}
public class clase_producto_con_tostring {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 59.99, 20);
        System.out.println(producto1);
    }
}