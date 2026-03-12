package mini_sistemas_con_metodos;
import java.util.Scanner;
public class sistema_de_reservas {
    public static void mostrarReservas(boolean[] reservas) {
        System.out.println("\n estado de las reservas:");
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i]) {
                System.out.println("espacio " + (i + 1) + ": reservado");
            } else {
                System.out.println("espacio " + (i + 1) + ": disponible");
            }
        }
    }
    public static void hacerReserva(boolean[] reservas, int posicion) {
        if (posicion >= 0 && posicion < reservas.length) {
            if (!reservas[posicion]) {
                reservas[posicion] = true;
                System.out.println("reserva realizada correctamente.");
            } else {
                System.out.println("ese espacio ya esta reservado.");
            }
        } else {
            System.out.println("numero de espacio invalido.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] reservas = new boolean[5];
        mostrarReservas(reservas);
        System.out.print("\n seleccione el numero del espacio que desea reservar: ");
        int espacio = scanner.nextInt();
        hacerReserva(reservas, espacio - 1);
        mostrarReservas(reservas);
        scanner.close();
    }
}