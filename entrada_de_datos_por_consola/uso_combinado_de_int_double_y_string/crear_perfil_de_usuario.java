package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class crear_perfil_de_usuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su nombre de usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("ingrese su altura: ");
        double altura = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.print("ingrese su pais: ");
        String pais = entrada.nextLine();
        System.out.print("ingrese su correo electronico: ");
        String correo = entrada.nextLine();
        System.out.println("\n perfil de usuario");
        System.out.println("usuario: " + usuario);
        System.out.println("edad: " + edad);
        System.out.println("altura: " + altura + " m");
        System.out.println("pais: " + pais);
        System.out.println("correo: " + correo);
        entrada.close();
    }
}