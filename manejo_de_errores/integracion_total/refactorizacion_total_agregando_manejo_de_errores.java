package integracion_total;
import java.util.Scanner;
public class refactorizacion_total_agregando_manejo_de_errores {
    static Scanner entrada = new Scanner(System.in);
    static String[] usuarios = new String[5];
    static int contador = 0;
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero();
            switch (opcion) {
                case 1:
                    agregarUsuario();
                    break;
                case 2:
                    mostrarUsuarios();
                    break;
                case 3:
                    eliminarUsuario();
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
    }
    public static void mostrarMenu() {
        System.out.println("\n sistema refactorizado ");
        System.out.println("1. agregar usuario");
        System.out.println("2. mostrar usuarios");
        System.out.println("3. eliminar usuario");
        System.out.println("4. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static int leerEntero() {
        try {
            return entrada.nextInt();
        } catch (Exception e) {
            System.out.println("error: debe ingresar un numero.");
            entrada.nextLine();
            return 0;
        }
    }
    public static void agregarUsuario() {
        entrada.nextLine();
        if (contador < usuarios.length) {
            System.out.print("ingrese el nombre del usuario: ");
            usuarios[contador] = entrada.nextLine();
            contador++;
            System.out.println("usuario agregado correctamente.");
        } else {
            System.out.println("no se pueden agregar mas usuarios.");
        }
    }
    public static void mostrarUsuarios() {
        if (contador == 0) {
            System.out.println("no hay usuarios registrados.");
        } else {
            System.out.println("\n lista de usuarios:");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + usuarios[i]);
            }
        }
    }
    public static void eliminarUsuario() {
        if (contador == 0) {
            System.out.println("no hay usuarios para eliminar.");
            return;
        }
        System.out.print("ingrese el numero del usuario a eliminar: ");
        int indice = leerEntero() - 1;
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                usuarios[i] = usuarios[i + 1];
            }
            contador--;
            System.out.println("usuario eliminado correctamente.");
        } else {
            System.out.println("usuario no valido.");
        }
    }
}