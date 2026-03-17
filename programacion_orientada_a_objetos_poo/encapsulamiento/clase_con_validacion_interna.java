package encapsulamiento;
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        setPrecio(precio);     
        setCantidad(cantidad); 
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("error: el precio no puede ser negativo.");
        }
    }
    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("error: la cantidad no puede ser negativa.");
        }
    }
}
public class clase_con_validacion_interna {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camiseta", 50.0, 10);
        System.out.println("producto: " + producto1.getNombre());
        System.out.println("precio: " + producto1.getPrecio());
        System.out.println("cantidad: " + producto1.getCantidad());
        System.out.println();
        producto1.setPrecio(-20);
        producto1.setCantidad(-5);
        System.out.println("despues de intentar valores invalidos:");
        System.out.println("precio: " + producto1.getPrecio());
        System.out.println("cantidad: " + producto1.getCantidad());
    }
}