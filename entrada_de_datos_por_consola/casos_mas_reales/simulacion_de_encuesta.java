package casos_mas_reales;
import java.util.Scanner;
public class simulacion_de_encuesta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la cantidad de personas a encuestar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); 
        String resumenEncuesta = "";
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\n persona " + i + " ");
            System.out.print("ingrese nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("ingrese edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); 
            System.out.print("califique el servicio del 1 al 5: ");
            int calificacion = entrada.nextInt();
            entrada.nextLine();
            resumenEncuesta += "nombre: " + nombre + ", edad: " + edad + ", calificación: " + calificacion + "\n";
        }
        System.out.println("\n resumen de la encuesta ");
        System.out.println(resumenEncuesta);
        entrada.close();
    }
}