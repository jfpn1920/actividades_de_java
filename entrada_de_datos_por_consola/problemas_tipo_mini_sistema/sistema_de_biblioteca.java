package problemas_tipo_mini_sistema;
import java.util.Scanner;
public class sistema_de_biblioteca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el titulo del libro: ");
        String titulo = entrada.nextLine();
        System.out.print("ingrese el autor del libro: ");
        String autor = entrada.nextLine();
        System.out.print("ingrese la cantidad de copias disponibles: ");
        int copias = entrada.nextInt();
        System.out.print("¿desea prestar un libro? (1: si, 2: no): ");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            if (copias > 0) {
                copias--; 
                System.out.println("libro prestado correctamente.");
            } else {
                System.out.println("no hay copias disponibles para prestar.");
            }
        } else {
            System.out.println("no se realizo ningun prestamo.");
        }
        System.out.println("\n informacion del libro ");
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("copias disponibles: " + copias);
        entrada.close();
    }
}