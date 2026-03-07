package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_datos_de_un_libro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el titulo del libro: ");
        String titulo = entrada.nextLine();
        System.out.print("ingrese el autor del libro: ");
        String autor = entrada.nextLine();
        System.out.print("ingrese el año de publicacion: ");
        int anio = entrada.nextInt();
        System.out.print("ingrese el precio del libro: ");
        double precio = entrada.nextDouble();
        System.out.println("\n--- datos del libro ---");
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("año de publicacion: " + anio);
        System.out.println("precio: " + precio);
        entrada.close();
    }
}