package mini_sistemas_orientados_a_objetos;
class Factura {
    String producto;
    double precio;
    int cantidad;
    public Factura(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double calcularTotal() {
        return precio * cantidad;
    }
    public void mostrarFactura() {
        System.out.println("producto: " + producto);
        System.out.println("precio unitario: $" + precio);
        System.out.println("cantidad: " + cantidad);
        System.out.println("total a pagar: $" + calcularTotal());
        System.out.println("-----------------------------");
    }
}
public class sistema_de_facturacion {
    public static void main(String[] args) {
        Factura factura1 = new Factura("camisa", 50.0, 2);
        Factura factura2 = new Factura("pantalon", 80.0, 1);
        factura1.mostrarFactura();
        factura2.mostrarFactura();
    }
}