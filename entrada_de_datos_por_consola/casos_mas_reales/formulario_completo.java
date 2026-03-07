package casos_mas_reales;
import java.util.Scanner;
public class formulario_completo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        String direccion;
        String telefono;
        String correo;
        String ciudad;
        System.out.println("formulario completo");
        System.out.print("ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese su apellido: ");
        apellido = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("ingrese su direccion: ");
        direccion = entrada.nextLine();
        System.out.print("ingrese su telefono: ");
        telefono = entrada.nextLine();
        System.out.print("ingrese su correo electronico: ");
        correo = entrada.nextLine();
        System.out.print("ingrese su ciudad: ");
        ciudad = entrada.nextLine();
        System.out.println("\n datos registrados ");
        System.out.println("nombre completo: " + nombre + " " + apellido);
        System.out.println("edad: " + edad);
        System.out.println("direccion: " + direccion);
        System.out.println("telefono: " + telefono);
        System.out.println("correo: " + correo);
        System.out.println("ciudad: " + ciudad);
        entrada.close();
    }
}