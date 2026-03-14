package refactorizacion_de_practica;
import java.util.Scanner;
public class mejorar_estructura_de_menu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ejecutarMenu();
    }
    public static void ejecutarMenu() {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 4);
    }
    public static void mostrarMenu() {
        System.out.println("\n menu de consola ");
        System.out.println("1. sumar numeros");
        System.out.println("2. restar numeros");
        System.out.println("3. mostrar mensaje");
        System.out.println("4. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static int leerOpcion() {
        return scanner.nextInt();
    }
    public static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                sumar();
                break;
            case 2:
                restar();
                break;
            case 3:
                mostrarMensaje();
                break;
            case 4:
                System.out.println("saliendo del programa...");
                break;
            default:
                System.out.println("opcion inválida.");
        }
    }
    public static void sumar() {
        System.out.print("ingrese primer numero: ");
        int a = scanner.nextInt();
        System.out.print("ingrese segundo numero: ");
        int b = scanner.nextInt();
        System.out.println("resultado: " + (a + b));
    }
    public static void restar() {
        System.out.print("ingrese primer numero: ");
        int a = scanner.nextInt();
        System.out.print("ingrese segundo numero: ");
        int b = scanner.nextInt();
        System.out.println("resultado: " + (a - b));
    }
    public static void mostrarMensaje() {
        System.out.println("este es un ejemplo de refactorizaciun del menu.");
    }
}