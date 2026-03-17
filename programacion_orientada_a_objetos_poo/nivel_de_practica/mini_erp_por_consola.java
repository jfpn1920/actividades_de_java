package nivel_de_practica;
class Producto {
    String nombre;
    double precio;
    int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void mostrarProducto() {
        System.out.println("producto: " + nombre);
        System.out.println("precio: $" + precio);
        System.out.println("stock disponible: " + stock);
        System.out.println("---------------------------");
    }
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("venta realizada de " + cantidad + " unidades.");
        } else {
            System.out.println("no hay suficiente stock.");
        }
    }
}
public class mini_erp_por_consola {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 60.0, 10);
        Producto producto2 = new Producto("pantalón", 80.0, 5);
        System.out.println("mini erp");
        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto1.vender(2);
        System.out.println("inventario actualizado");
        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }
}