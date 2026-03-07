package casos_mas_reales;
import java.util.Scanner;
public class mini_agenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String telefono;
        String correo;
        String direccion;
        System.out.println("mini agenda de contactos");
        System.out.print("ingrese el nombre del contacto: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese el telefono: ");
        telefono = entrada.nextLine();
        System.out.print("ingrese el correo electronico: ");
        correo = entrada.nextLine();
        System.out.print("ingrese la direccion: ");
        direccion = entrada.nextLine();
        System.out.println("\n contactatos guardados ");
        System.out.println("nombre: " + nombre);
        System.out.println("telefono: " + telefono);
        System.out.println("correo: " + correo);
        System.out.println("direccion: " + direccion);
        entrada.close();
    }
}