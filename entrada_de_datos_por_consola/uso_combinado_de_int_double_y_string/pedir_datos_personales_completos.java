package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_datos_personales_completos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su nombre completo: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("ingrese su estatura en metros: ");
        double estatura = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("ingrese su ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("\n datos personales");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + " m");
        System.out.println("ciudad: " + ciudad);
        entrada.close();
    }
}