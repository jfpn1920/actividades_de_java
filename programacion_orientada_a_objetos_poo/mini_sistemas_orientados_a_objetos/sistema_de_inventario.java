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
    public void mostrarProducto() {
        System.out.println("producto: " + nombre);
        System.out.println("precio: $" + precio);
        System.out.println("cantidad en inventario: " + cantidad);
        System.out.println("---------------------------");
    }
    public void agregarStock(int cantidadAgregar) {
        cantidad = cantidad + cantidadAgregar;
        System.out.println("se agregaron " + cantidadAgregar + " unidades.");
    }
    public void venderProducto(int cantidadVender) {
        if (cantidadVender <= cantidad) {
            cantidad = cantidad - cantidadVender;
            System.out.println("se vendieron " + cantidadVender + " unidades.");
        } else {
            System.out.println("no hay suficiente stock.");
        }
    }
}
public class sistema_de_inventario {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 60.0, 10);
        producto1.mostrarProducto();
        producto1.agregarStock(5);
        producto1.venderProducto(3);
        producto1.mostrarProducto();
    }
}