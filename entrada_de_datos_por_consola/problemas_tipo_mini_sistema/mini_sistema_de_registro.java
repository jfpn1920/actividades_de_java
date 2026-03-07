package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class mini_sistema_de_registro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("ingrese su correo electronico: ");
        String correo = entrada.nextLine();
        System.out.println("\n registro completado");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("correo: " + correo);
        entrada.close();
    }
}