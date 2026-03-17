package metodo_tostring;
class Producto {
    String nombre;
    double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "producto: " + nombre + ", precio: $" + precio;
    }
}
public class mini_sistema_mostrando_multiples_objetos {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 50.0);
        Producto producto2 = new Producto("pantalón", 80.0);
        Producto producto3 = new Producto("zapatos", 120.0);
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
}