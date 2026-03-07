package casos_mas_reales;
import java.util.Scanner;
public class registro_de_citas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String motivo;
        String fecha;
        String hora;
        String especialista;
        System.out.println("registro de citas");
        System.out.print("ingrese el nombre del paciente o cliente: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese el motivo de la cita: ");
        motivo = entrada.nextLine();
        System.out.print("ingrese la fecha de la cita: ");
        fecha = entrada.nextLine();
        System.out.print("ingrese la hora de la cita: ");
        hora = entrada.nextLine();
        System.out.print("ingrese el nombre del especialista o lugar: ");
        especialista = entrada.nextLine();
        System.out.println("\n cita registrada ");
        System.out.println("nombre: " + nombre);
        System.out.println("motivo: " + motivo);
        System.out.println("fecha: " + fecha);
        System.out.println("hora: " + hora);
        System.out.println("especialista/lugar: " + especialista);
        entrada.close();
    }
}