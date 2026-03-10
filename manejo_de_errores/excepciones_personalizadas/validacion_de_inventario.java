package excepciones_personalizadas;
import java.util.Scanner;
class CantidadInvalidaException extends Exception {
    public CantidadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
class Producto {
    private String nombre;
    private int cantidad;
    public Producto(String nombre, int cantidad) throws CantidadInvalidaException {
        this.nombre = nombre;
        setCantidad(cantidad); 
    }
    public void setCantidad(int cantidad) throws CantidadInvalidaException {
        if (cantidad < 0) {
            throw new CantidadInvalidaException("cantidad invalida para " + nombre + ": no puede ser negativa.");
        }
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void agregarStock(int cantidad) throws CantidadInvalidaException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("cantidad a agregar debe ser mayor que 0.");
        }
        this.cantidad += cantidad;
    }
    public void retirarStock(int cantidad) throws CantidadInvalidaException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("cantidad a retirar debe ser mayor que 0.");
        }
        if (cantidad > this.cantidad) {
            throw new CantidadInvalidaException("cantidad insuficiente en inventario, disponible: " + this.cantidad);
        }
        this.cantidad -= cantidad;
    }
}
public class validacion_de_inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("ingrese cantidad inicial del producto: ");
            int cantidad = scanner.nextInt();
            Producto producto = new Producto(nombre, cantidad);
            System.out.println("producto registrado: " + producto.getNombre() + " con cantidad: " + producto.getCantidad());
            System.out.print("ingrese cantidad a retirar: ");
            int retirar = scanner.nextInt();
            producto.retirarStock(retirar);
            System.out.println("retiro exitoso, cantidad restante: " + producto.getCantidad());
            System.out.print("ingrese cantidad a agregar: ");
            int agregar = scanner.nextInt();
            producto.agregarStock(agregar);
            System.out.println("stock actualizado, cantidad total: " + producto.getCantidad());
        } catch (CantidadInvalidaException e) {
            System.out.println("excepcion capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}