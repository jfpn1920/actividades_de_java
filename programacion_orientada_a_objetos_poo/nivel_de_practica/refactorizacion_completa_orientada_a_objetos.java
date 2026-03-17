package nivel_de_practica;
class Producto {
    String nombre;
    double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarProducto() {
        System.out.println("producto: " + nombre);
        System.out.println("precio: $" + precio);
    }
}
class Pedido {
    Producto producto;
    int cantidad;
    public Pedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public double calcularTotal() {
        return producto.precio * cantidad;
    }
    public void mostrarPedido() {
        producto.mostrarProducto();
        System.out.println("cantidad: " + cantidad);
        System.out.println("total: $" + calcularTotal());
        System.out.println("----------------------------");
    }
}
public class refactorizacion_completa_orientada_a_objetos {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 60.0);
        Pedido pedido1 = new Pedido(producto1, 2);
        pedido1.mostrarPedido();
    }
}