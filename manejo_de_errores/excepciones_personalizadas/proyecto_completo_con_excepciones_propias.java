package excepciones_personalizadas;
import java.util.Scanner;
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
class CantidadInvalidaException extends Exception {
    public CantidadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
class Estudiante {
    private String nombre;
    private double nota;
    public Estudiante(String nombre, double nota) throws NotaInvalidaException {
        this.nombre = nombre;
        setNota(nota);
    }
    public void setNota(double nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 5) {
            throw new NotaInvalidaException("nota invalida para " + nombre + ": debe estar entre 0 y 5.");
        }
        this.nota = nota;
    }
    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
}
class Cuenta {
    private double saldo;
    public Cuenta(double saldoInicial) throws IllegalArgumentException {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }
    public void depositar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("el deposito debe ser mayor a 0.");
        }
        saldo += cantidad;
    }
    public void retirar(double cantidad) throws SaldoInsuficienteException, IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("el retiro debe ser mayor a 0.");
        }
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("saldo insuficiente, saldo actual: " + saldo);
        }
        saldo -= cantidad;
    }
    public double getSaldo() { return saldo; }
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
    public int getCantidad() { return cantidad; }
    public String getNombre() { return nombre; }
    public void agregarStock(int cantidad) throws CantidadInvalidaException {
        if (cantidad <= 0) throw new CantidadInvalidaException("cantidad a agregar debe ser mayor que 0.");
        this.cantidad += cantidad;
    }
    public void retirarStock(int cantidad) throws CantidadInvalidaException {
        if (cantidad <= 0) throw new CantidadInvalidaException("cantidad a retirar debe ser mayor que 0.");
        if (cantidad > this.cantidad) throw new CantidadInvalidaException("cantidad insuficiente en inventario, disponible: " + this.cantidad);
        this.cantidad -= cantidad;
    }
}
public class proyecto_completo_con_excepciones_propias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("registro academico");
            System.out.print("ingrese nombre del estudiante: ");
            String nombreEstudiante = scanner.nextLine();
            System.out.print("ingrese la nota del estudiante del 0 al 5: ");
            double nota = scanner.nextDouble();
            Estudiante estudiante = new Estudiante(nombreEstudiante, nota);
            System.out.println("estudiante registrado: " + estudiante.getNombre() + " con nota: " + estudiante.getNota());
            System.out.println("\n sistema bancario ");
            System.out.print("ingrese saldo inicial de la cuenta: ");
            double saldoInicial = scanner.nextDouble();
            Cuenta cuenta = new Cuenta(saldoInicial);
            System.out.print("ingrese monto a retirar: ");
            double retiro = scanner.nextDouble();
            cuenta.retirar(retiro);
            System.out.println("retiro exitoso, saldo restante: " + cuenta.getSaldo());
            System.out.print("ingrese monto a depositar: ");
            double deposito = scanner.nextDouble();
            cuenta.depositar(deposito);
            System.out.println("deposito exitoso, saldo actual: " + cuenta.getSaldo());
            System.out.println("\n inventario de productos ");
            scanner.nextLine();
            System.out.print("ingrese nombre del producto: ");
            String nombreProducto = scanner.nextLine();
            System.out.print("ingrese cantidad inicial del producto: ");
            int cantidad = scanner.nextInt();
            Producto producto = new Producto(nombreProducto, cantidad);
            System.out.print("ingrese cantidad a retirar: ");
            int retirar = scanner.nextInt();
            producto.retirarStock(retirar);
            System.out.println("retiro exitoso, cantidad restante: " + producto.getCantidad());
            System.out.print("ingrese cantidad a agregar: ");
            int agregar = scanner.nextInt();
            producto.agregarStock(agregar);
            System.out.println("stock actualizado, cantidad total: " + producto.getCantidad());
        } catch (NotaInvalidaException e) {
            System.out.println("error academico: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("error bancario: " + e.getMessage());
        } catch (CantidadInvalidaException e) {
            System.out.println("error de inventario: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\n proyecto finalizado con manejo de excepciones propias ");
        }
    }
}