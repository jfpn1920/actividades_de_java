package el_uso_del_arrays_mas_poo;
public class arreglo_de_producto {
    String nombre;
    double precio;
    int cantidad;
    public arreglo_de_producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "producto: " + nombre + 
            " | precio: " + precio + 
            " | cantidad: " + cantidad;
    }
}

//package el_uso_del_arrays_mas_poo;
//public class arreglo_de_producto {
//    public static void main(String[] args) {
//        Producto[] productos = new Producto[3];
//        productos[0] = new Producto("Laptop", 3500.0, 5);
//        productos[1] = new Producto("Mouse", 25.5, 20);
//        productos[2] = new Producto("Teclado", 80.0, 10);
//        for (int i = 0; i < productos.length; i++) {
//            System.out.println(productos[i]);
//        }
//    }
//}