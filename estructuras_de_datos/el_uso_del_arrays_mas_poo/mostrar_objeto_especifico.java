package el_uso_del_arrays_mas_poo;
public class mostrar_objeto_especifico {
    String nombre;
    double precio;
    public mostrar_objeto_especifico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "producto: " + nombre + " | precio: " + precio;
    }
}

//package el_uso_del_arrays_mas_poo;
//public class mostrar_objeto_especifico {
//    public static void main(String[] args) {
//        Producto[] productos = new Producto[3];
//        productos[0] = new Producto("laptop", 3500);
//        productos[1] = new Producto("mouse", 25);
//        productos[2] = new Producto("teclado", 80);
//        int posicion = 1; 
//        System.out.println("objeto en la posicion " + posicion + ":");
//        System.out.println(productos[posicion]);
//    }
//}