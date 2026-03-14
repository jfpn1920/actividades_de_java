package el_uso_de_importaciones;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class proyecto_pequeño_con_multiples_imports {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        Random aleatorio = new Random();
        System.out.print("ingrese el primer nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.print("ingrese el segundo nombre: ");
        String nombre2 = entrada.nextLine();
        nombres.add(nombre1);
        nombres.add(nombre2);
        System.out.println("\n lista de nombres ingresados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        int numeroAleatorio = aleatorio.nextInt(100);
        System.out.println("\n numero aleatorio generado: " + numeroAleatorio);
        entrada.close();
    }
}