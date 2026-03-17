package nivel_de_practica;
class Cliente {
    String nombre;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarCliente() {
        System.out.println("cliente: " + nombre);
    }
}
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
class Venta {
    Cliente cliente;
    Producto producto;
    int cantidad;
    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public double calcularTotal() {
        return producto.precio * cantidad;
    }
    public void mostrarVenta() {
        cliente.mostrarCliente();
        producto.mostrarProducto();
        System.out.println("cantidad: " + cantidad);
        System.out.println("total a pagar: $" + calcularTotal());
        System.out.println("----------------------------");
    }
}
public class proyecto_final_poo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("juan");
        Producto producto1 = new Producto("camisa", 60.0);
        Venta venta1 = new Venta(cliente1, producto1, 2);
        System.out.println("sistema de ventas");
        venta1.mostrarVenta();
    }
}