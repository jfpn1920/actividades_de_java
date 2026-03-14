package nivel_de_practica;
import java.util.ArrayList;
import java.util.Scanner;
public class uso_de_arraylist {
    static ArrayList<String> lista = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int opcion;
        do {
            System.out.println("\n uso del arraylist ");
            System.out.println("1. agregar elemento");
            System.out.println("2. mostrar elementos");
            System.out.println("3. eliminar elemento");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarElemento();
                    break;
                case 2:
                    mostrarElementos();
                    break;
                case 3:
                    eliminarElemento();
                    break;
                case 4:
                    System.out.println("programa finalizado.");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
    }
    public static void agregarElemento() {
        System.out.print("ingrese un elemento: ");
        String elemento = scanner.nextLine();
        lista.add(elemento);
        System.out.println("elemento agregado correctamente.");
    }
    public static void mostrarElementos() {
        if (lista.isEmpty()) {
            System.out.println("la lista esta vacia.");
            return;
        }
        System.out.println("\n elementos de la lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }
    public static void eliminarElemento() {
        if (lista.isEmpty()) {
            System.out.println("no hay elementos para eliminar.");
            return;
        }
        mostrarElementos();
        System.out.print("ingrese el numero del elemento a eliminar: ");
        int indice = scanner.nextInt();
        if (indice > 0 && indice <= lista.size()) {
            lista.remove(indice - 1);
            System.out.println("elemento eliminado correctamente.");
        } else {
            System.out.println("numero invalido.");
        }
    }
}