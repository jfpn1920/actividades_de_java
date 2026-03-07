package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class sistema_de_reservas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del cliente: ");
        String cliente = entrada.nextLine();
        System.out.print("ingrese la fecha de la reserva dd/mm/aaaa: ");
        String fecha = entrada.nextLine();
        System.out.print("ingrese el tipo de reserva: ");
        String tipoReserva = entrada.nextLine();
        System.out.println("\n resumen de la reserva ");
        System.out.println("cliente: " + cliente);
        System.out.println("fecha: " + fecha);
        System.out.println("tipo de reserva: " + tipoReserva);
        System.out.println("estado: reserva confirmada");
        entrada.close();
    }
}