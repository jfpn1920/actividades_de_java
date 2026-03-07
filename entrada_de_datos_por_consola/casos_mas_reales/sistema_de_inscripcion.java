package casos_mas_reales;
import java.util.Scanner;
public class sistema_de_inscripcion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String curso;
        String correo;
        System.out.println("sistema de inscripcion");
        System.out.print("ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("ingrese el curso al que desea inscribirse: ");
        curso = entrada.nextLine();
        System.out.print("ingrese su correo electronico: ");
        correo = entrada.nextLine();
        System.out.println("\n confirmacion de inscripcion ");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("curso: " + curso);
        System.out.println("correo: " + correo);
        System.out.println("inscripcion realizada con exito.");
        entrada.close();
    }
}