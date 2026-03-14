package nivel_de_practica;
import java.util.ArrayList;
import java.util.Scanner;
public class crud_completo_modular {
    static ArrayList<String> datos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int opcion;
        do {
            System.out.println("\n sistema crud ");
            System.out.println("1. crear registro");
            System.out.println("2. mostrar registros");
            System.out.println("3. actualizar registro");
            System.out.println("4. eliminar registro");
            System.out.println("5. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    crearRegistro();
                    break;
                case 2:
                    mostrarRegistros();
                    break;
                case 3:
                    actualizarRegistro();
                    break;
                case 4:
                    eliminarRegistro();
                    break;
                case 5:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 5);
    }
    public static void crearRegistro() {
        System.out.print("ingrese un nuevo dato: ");
        String dato = scanner.nextLine();
        datos.add(dato);
        System.out.println("registro agregado correctamente.");
    }
    public static void mostrarRegistros() {
        if (datos.isEmpty()) {
            System.out.println("no hay registros.");
            return;
        }
        System.out.println("\n lista de registros:");
        for (int i = 0; i < datos.size(); i++) {
            System.out.println((i + 1) + ". " + datos.get(i));
        }
    }
    public static void actualizarRegistro() {
        if (datos.isEmpty()) {
            System.out.println("no hay registros para actualizar.");
            return;
        }
        mostrarRegistros();
        System.out.print("seleccione el numero del registro a actualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (indice > 0 && indice <= datos.size()) {
            System.out.print("ingrese el nuevo valor: ");
            String nuevoDato = scanner.nextLine();
            datos.set(indice - 1, nuevoDato);
            System.out.println("registro actualizado correctamente.");
        } else {
            System.out.println("numero invalido.");
        }
    }
    public static void eliminarRegistro() {
        if (datos.isEmpty()) {
            System.out.println("no hay registros para eliminar.");
            return;
        }
        mostrarRegistros();
        System.out.print("seleccione el numero del registro a eliminar: ");
        int indice = scanner.nextInt();
        if (indice > 0 && indice <= datos.size()) {
            datos.remove(indice - 1);
            System.out.println("registro eliminado correctamente.");
        } else {
            System.out.println("numero invalido.");
        }
    }
}