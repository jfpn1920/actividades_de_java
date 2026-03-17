package mini_sistemas_orientados_a_objetos;
class Producto {
    String nombre;
    double precio;
    int cantidad;
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double calcularTotal() {
        return precio * cantidad;
    }
    public void mostrarProducto() {
        System.out.println("producto: " + nombre);
        System.out.println("precio: $" + precio);
        System.out.println("cantidad: " + cantidad);
        System.out.println("total de compra: $" + calcularTotal());
        System.out.println("---------------------------");
    }
}
public class sistema_de_tienda {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 60.0, 2);
        Producto producto2 = new Producto("pantalón", 80.0, 1);
        Producto producto3 = new Producto("zapatos", 120.0, 1);
        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto3.mostrarProducto();
    }
}