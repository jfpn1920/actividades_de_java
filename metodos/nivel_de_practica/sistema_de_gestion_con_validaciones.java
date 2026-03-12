package nivel_de_practica;
import java.util.Scanner;
public class sistema_de_gestion_con_validaciones {
    public static void mostrarMenu() {
        System.out.println("\n sistema de gestion ");
        System.out.println("1. registrar usuario");
        System.out.println("2. mostrar usuarios");
        System.out.println("3. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static String validarNombre(Scanner scanner) {
        String nombre;
        do {
            System.out.print("ingrese el nombre: ");
            nombre = scanner.nextLine();
            if (nombre.trim().isEmpty()) {
                System.out.println("el nombre no puede estar vacio.");
            }
        } while (nombre.trim().isEmpty());
        return nombre;
    }
    public static int validarEdad(Scanner scanner) {
        int edad;
        do {
            System.out.print("ingrese la edad, mayor que 0: ");
            edad = scanner.nextInt();
            scanner.nextLine();
            if (edad <= 0) {
                System.out.println("edad invalida.");
            }
        } while (edad <= 0);
        return edad;
    }
    public static void registrarUsuario(String[] nombres, int[] edades, Scanner scanner, int indice) {
        String nombre = validarNombre(scanner);
        int edad = validarEdad(scanner);
        nombres[indice] = nombre;
        edades[indice] = edad;
        System.out.println("usuario registrado correctamente.");
    }
    public static void mostrarUsuarios(String[] nombres, int[] edades) {
        System.out.println("\n lista de usuarios ");
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null) {
                System.out.println("nombre: " + nombres[i] + " | edad: " + edades[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] edades = new int[5];
        int contador = 0;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    if (contador < nombres.length) {
                        registrarUsuario(nombres, edades, scanner, contador);
                        contador++;
                    } else {
                        System.out.println("no se pueden registrar mas usuarios.");
                    }
                    break;
                case 2:
                    mostrarUsuarios(nombres, edades);
                    break;
                case 3:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}