package metodos_static;
import java.util.Scanner;
public class crear_menu_con_metodos_static {
    public static void mostrarSaludo() {
        System.out.println("hola, bienvenido al menu de aava.");
    }
    public static void sumarNumeros(Scanner sc) {
        System.out.print("ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("la suma es: " + (num1 + num2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n menu de consola ");
            System.out.println("1. saludar");
            System.out.println("2. sumar numeros");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    mostrarSaludo(); 
                    break;
                case 2:
                    sumarNumeros(sc); 
                    break;
                case 3:
                    System.out.println("saliendo del programa...");
                    break;
                default:
                    System.out.println("opcion no valida, intente de nuevo.");
            }
        } while (opcion != 3);
        sc.close();
    }
}