package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_datos_de_una_pelicula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre de la pelicula: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese el año de estreno: ");
        int anio = entrada.nextInt();
        System.out.print("ingrese la duracion en minutos: ");
        int duracion = entrada.nextInt();
        System.out.print("ingrese la calificación de la pelicula: ");
        double calificacion = entrada.nextDouble();
        System.out.println("\n datos de la pelicula");
        System.out.println("nombre: " + nombre);
        System.out.println("año de estreno: " + anio);
        System.out.println("duracion: " + duracion + " minutos");
        System.out.println("calificacion: " + calificacion);
        entrada.close();
    }
}