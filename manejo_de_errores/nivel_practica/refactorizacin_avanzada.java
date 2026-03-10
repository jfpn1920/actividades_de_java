package nivel_practica;
import java.util.Scanner;
public class refactorizacin_avanzada {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.iniciar();
    }
}
class Sistema {
    private Scanner entrada = new Scanner(System.in);
    private GestorUsuarios gestor = new GestorUsuarios();
    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = Entrada.leerEntero(entrada, "seleccione una opcion: ");
            ejecutarOpcion(opcion);
        } while (opcion != 4);
        entrada.close();
    }
    private void mostrarMenu() {
        System.out.println("\n sistema de refacturacion ");
        System.out.println("1. agregar usuario");
        System.out.println("2. mostrar usuarios");
        System.out.println("3. eliminar usuario");
        System.out.println("4. salir");
    }
    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                String nombre = Entrada.leerTexto(entrada, "ingrese nombre del usuario: ");
                gestor.agregarUsuario(nombre);
                break;
            case 2:
                gestor.mostrarUsuarios();
                break;
            case 3:
                int indice = Entrada.leerEntero(entrada, "numero de usuario a eliminar: ");
                gestor.eliminarUsuario(indice);
                break;
            case 4:
                System.out.println("cerrando sistema...");
                break;
            default:
                System.out.println("opcion invalida.");
        }
    }
}
class Entrada {
    public static int leerEntero(Scanner entrada, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(entrada.nextLine());
            } catch (Exception e) {
                System.out.println("error: ingrese un numero valido.");
            }
        }
    }
    public static String leerTexto(Scanner entrada, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = entrada.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("error: el texto no puede estar vacio.");
        }
    }
}
class Usuario {
    String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}
class GestorUsuarios {
    private Usuario[] usuarios = new Usuario[10];
    private int contador = 0;
    public void agregarUsuario(String nombre) {
        if (contador < usuarios.length) {
            usuarios[contador] = new Usuario(nombre);
            contador++;
            System.out.println("usuario agregado correctamente.");
        } else {
            System.out.println("no hay espacio para mas usuarios.");
        }
    }
    public void mostrarUsuarios() {
        if (contador == 0) {
            System.out.println("no hay usuarios registrados.");
            return;
        }
        System.out.println("\n lista de usuarios:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + usuarios[i].nombre);
        }
    }
    public void eliminarUsuario(int indice) {
        indice--;
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                usuarios[i] = usuarios[i + 1];
            }
            contador--;
            System.out.println("usuario eliminado correctamente.");
        } else {
            System.out.println("indice invalido.");
        }
    }
}