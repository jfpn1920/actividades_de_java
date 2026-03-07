package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_registro_con_validaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String correo;
        String contraseña;
        int edad;
        System.out.println("sistema de registro");
        System.out.print("ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese su correo: ");
        correo = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("ingrese una contraseña minimo 6 caracteres: ");
        contraseña = entrada.nextLine();
        System.out.println("\n resultado de registro ");
        if (edad >= 18 && contraseña.length() >= 6) {
            System.out.println("registro exitoso.");
            System.out.println("nombre: " + nombre);
            System.out.println("correo: " + correo);
            System.out.println("edad: " + edad);
        } else {
            System.out.println("error en el registro.");
            
            if (edad < 18) {
                System.out.println("debe ser mayor de edad para registrarse.");
            }
            if (contraseña.length() < 6) {
                System.out.println("la contraseña debe tener al menos 6 caracteres.");
            }
        }
        entrada.close();
    }
}