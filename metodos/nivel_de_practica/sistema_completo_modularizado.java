package nivel_de_practica;
import java.util.Scanner;
public class sistema_completo_modularizado {
    public static void mostrarMenu() {
        System.out.println("\n sistema completo ");
        System.out.println("1. registrar usuario");
        System.out.println("2. ver usuarios");
        System.out.println("3. contar usuarios");
        System.out.println("4. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static void registrarUsuario(String[] usuarios, Scanner scanner, int indice) {
        System.out.print("ingrese el nombre del usuario: ");
        usuarios[indice] = scanner.nextLine();
        System.out.println("usuario registrado correctamente.");
    }
    public static void mostrarUsuarios(String[] usuarios) {
        System.out.println("\n lista de usuarios:");
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                System.out.println((i + 1) + ". " + usuarios[i]);
            }
        }
    }
    public static int contarUsuarios(String[] usuarios) {
        int contador = 0;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usuarios = new String[5];
        int contador = 0;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    if (contador < usuarios.length) {
                        registrarUsuario(usuarios, scanner, contador);
                        contador++;
                    } else {
                        System.out.println("no se pueden registrar mas usuarios.");
                    }
                    break;
                case 2:
                    mostrarUsuarios(usuarios);
                    break;
                case 3:
                    int total = contarUsuarios(usuarios);
                    System.out.println("total de usuarios registrados: " + total);
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