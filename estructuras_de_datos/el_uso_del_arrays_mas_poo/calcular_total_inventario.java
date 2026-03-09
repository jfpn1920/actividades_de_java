package el_uso_del_arrays_mas_poo;
public class calcular_total_inventario {
    String nombre;
    double precio;
    int cantidad;
    public calcular_total_inventario(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double calcularTotal() {
        return precio * cantidad;
    }
    @Override
    public String toString() {
        return "producto: " + nombre +
            " | precio: " + precio +
            " | cantidad: " + cantidad;
    }
}

// package el_uso_del_arrays_mas_poo;
// public class calcular_total_inventario {
//     public static void main(String[] args) {
//         Producto[] productos = new Producto[3];
//         productos[0] = new Producto("laptop", 3500, 5);
//         productos[1] = new Producto("mouse", 25, 20);
//         productos[2] = new Producto("teclado", 80, 10);
//         double totalInventario = 0;
//         for (int i = 0; i < productos.length; i++) {
//             totalInventario += productos[i].calcularTotal();
//         }
//         System.out.println("valor total del inventario: " + totalInventario);
//     }
// }