package metodos_con_excepciones;
import java.util.Scanner;
class Producto {
    private double precio;
    public Producto(double precioInicial) throws IllegalArgumentException {
        validarPrecio(precioInicial);
        this.precio = precioInicial;
    }
    public void setPrecio(double precio) throws IllegalArgumentException {
        validarPrecio(precio);
        this.precio = precio;
    }
    private void validarPrecio(double precio) throws IllegalArgumentException {
        if (precio <= 0) {
            throw new IllegalArgumentException("error: el precio debe ser mayor que 0.");
        }
    }
    public double getPrecio() {
        return precio;
    }
}
public class clase_producto_con_validacion_de_precio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese el precio inicial del producto: ");
            double precioInicial = scanner.nextDouble();
            Producto producto = new Producto(precioInicial);
            System.out.print("ingrese el nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            producto.setPrecio(nuevoPrecio);
            System.out.println("precio final del producto: " + producto.getPrecio());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}