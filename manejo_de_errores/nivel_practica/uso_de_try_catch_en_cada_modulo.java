package nivel_practica;
import java.util.Scanner;
public class uso_de_try_catch_en_cada_modulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorUsuarios gestor = new GestorUsuarios();
        int opcion = 0;
        do {
            try {
                System.out.println("\n sistema con try catch por modulo ");
                System.out.println("1. agregar usuario");
                System.out.println("2. mostrar usuarios");
                System.out.println("3. eliminar usuario");
                System.out.println("4. salir");
                System.out.print("seleccione una opcion: ");
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.print("ingrese nombre del usuario: ");
                        String nombre = entrada.nextLine();
                        gestor.agregarUsuario(nombre);
                        break;
                    case 2:
                        gestor.mostrarUsuarios();
                        break;
                    case 3:
                        System.out.print("ingrese numero del usuario a eliminar: ");
                        int indice = entrada.nextInt();
                        gestor.eliminarUsuario(indice);
                        break;
                    case 4:
                        System.out.println("saliendo del sistema...");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: entrada invalida.");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 4);
        entrada.close();
    }
}
class Usuario {
    String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}
class GestorUsuarios {
    Usuario[] lista = new Usuario[5];
    int contador = 0;
    public void agregarUsuario(String nombre) {
        try {
            if (contador < lista.length) {
                lista[contador] = new Usuario(nombre);
                contador++;
                System.out.println("usuario agregado correctamente.");
            } else {
                System.out.println("no se pueden agregar mas usuarios.");
            }
        } catch (Exception e) {
            System.out.println("error al agregar usuario.");
        }
    }
    public void mostrarUsuarios() {
        try {
            if (contador == 0) {
                System.out.println("no hay usuarios registrados.");
                return;
            }
            System.out.println("\n lista de usuarios:");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + lista[i].nombre);
            }
        } catch (Exception e) {
            System.out.println("error al mostrar usuarios.");
        }
    }
    public void eliminarUsuario(int indice) {
        try {
            indice = indice - 1;
            if (indice >= 0 && indice < contador) {
                for (int i = indice; i < contador - 1; i++) {
                    lista[i] = lista[i + 1];
                }
                contador--;
                System.out.println("usuario eliminado correctamente.");
            } else {
                System.out.println("usuario no valido.");
            }
        } catch (Exception e) {
            System.out.println("error al eliminar usuario.");
        }
    }
}