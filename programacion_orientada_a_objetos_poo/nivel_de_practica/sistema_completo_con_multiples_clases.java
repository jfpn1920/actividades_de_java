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
class Cliente {
    String nombre;
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarCliente() {
        System.out.println("cliente: " + nombre);
    }
}
public class sistema_completo_con_multiples_clases {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("juan");
        Producto producto1 = new Producto("camisa", 60.0);
        System.out.println("sistema de compras");
        cliente1.mostrarCliente();
        producto1.mostrarProducto();
        System.out.println("compra realizada correctamente.");
    }
}