package metodos_con_excepciones;
import java.util.Scanner;
class Cuenta {
    private double saldo;
    public Cuenta(double saldoInicial) throws IllegalArgumentException {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("error: saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }
    public void depositar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("error: el deposito debe ser mayor que 0.");
        }
        saldo += cantidad;
    }
    public void retirar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("error: el retiro debe ser mayor que 0.");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("error: no hay suficiente saldo.");
        }
        saldo -= cantidad;
    }
    public double getSaldo() {
        return saldo;
    }
}
class Estudiante {
    private double nota;
    public Estudiante(double notaInicial) throws IllegalArgumentException {
        validarNota(notaInicial);
        this.nota = notaInicial;
    }
    public void setNota(double nota) throws IllegalArgumentException {
        validarNota(nota);
        this.nota = nota;
    }
    private void validarNota(double nota) throws IllegalArgumentException {
        if (nota < 0 || nota > 5) {
            throw new IllegalArgumentException("error: La nota debe estar entre 0 y 5.");
        }
    }
    public double getNota() {
        return nota;
    }
}
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
public class sistema_completo_con_validaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("ingrese saldo inicial de la cuenta: ");
            double saldoInicial = scanner.nextDouble();
            Cuenta cuenta = new Cuenta(saldoInicial);
            System.out.print("ingrese cantidad a depositar: ");
            double deposito = scanner.nextDouble();
            cuenta.depositar(deposito);
            System.out.print("ingrese cantidad a retirar: ");
            double retiro = scanner.nextDouble();
            cuenta.retirar(retiro);
            System.out.println("saldo final de la cuenta: " + cuenta.getSaldo());
            System.out.print("\n ingrese nota inicial del estudiante del 0 al 5: ");
            double notaInicial = scanner.nextDouble();
            Estudiante estudiante = new Estudiante(notaInicial);
            System.out.print("ingrese nueva nota del estudiante del 0 al 5: ");
            double nuevaNota = scanner.nextDouble();
            estudiante.setNota(nuevaNota);
            System.out.println("nota final del estudiante: " + estudiante.getNota());
            System.out.print("\n ingrese precio inicial del producto: ");
            double precioInicial = scanner.nextDouble();
            Producto producto = new Producto(precioInicial);
            System.out.print("ingrese nuevo precio del producto: ");
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