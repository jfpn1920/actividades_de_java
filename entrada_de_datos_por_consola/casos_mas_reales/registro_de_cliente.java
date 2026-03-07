package casos_mas_reales;
import java.util.Scanner;
public class registro_de_cliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese nombre del cliente: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese edad del cliente: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("ingrese correo electronico: ");
        String correo = entrada.nextLine();
        System.out.print("ingrese telefono: ");
        String telefono = entrada.nextLine();
        System.out.println("\n cliente registrado ");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("correo: " + correo);
        System.out.println("teléfono: " + telefono);
        entrada.close();
    }
}