package nivel_de_practica;
import java.util.Scanner;
import java.util.Random;
public class sistema_de_menu_completo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcion;
        do {
            System.out.println("\n menu de opciones");
            System.out.println("1. saludar");
            System.out.println("2. mostrar numero aleatorio");
            System.out.println("3. sumar dos numeros");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("hola, bienvenido al sistema.");
                    break;
                case 2:
                    int numero = random.nextInt(100);
                    System.out.println("numero aleatorio: " + numero);
                    break;
                case 3:
                    System.out.print("ingrese el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("la suma es: " + suma);
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}