package nivel_practica;
import java.util.Scanner;
public class manejo_profesional_de_entradas {
    public static void main(String[] args) {
        GestorUsuarios gestor = new GestorUsuarios();
        int opcion;
        do {
            System.out.println("\n sistema de manejo de entrada ");
            System.out.println("1. agregar usuario");
            System.out.println("2. mostrar usuarios");
            System.out.println("3. eliminar usuario");
            System.out.println("4. salir");
            opcion = Entrada.leerEntero("seleccione una opcion: ");
            switch (opcion) {
                case 1:
                    String nombre = Entrada.leerTexto("ingrese nombre del usuario: ");
                    gestor.agregarUsuario(nombre);
                    break;
                case 2:
                    gestor.mostrarUsuarios();
                    break;
                case 3:
                    int indice = Entrada.leerEntero("ingrese numero del usuario a eliminar: ");
                    gestor.eliminarUsuario(indice);
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        Entrada.cerrarScanner();
    }
}
class Entrada {
    private static Scanner scanner = new Scanner(System.in);
    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = Integer.parseInt(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("error: debe ingresar un numero valido.");
            }
        }
    }
    public static String leerTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("error: el texto no puede estar vacio.");
        }
    }
    public static double leerDecimal(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                double numero = Double.parseDouble(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("error: debe ingresar un numero decimal valido.");
            }
        }
    }
    public static void cerrarScanner() {
        scanner.close();
    }
}
class Usuario {
    String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}
class GestorUsuarios {
    Usuario[] lista = new Usuario[10];
    int contador = 0;
    public void agregarUsuario(String nombre) {
        if (contador < lista.length) {
            lista[contador] = new Usuario(nombre);
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
            System.out.println((i + 1) + ". " + lista[i].nombre);
        }
    }
    public void eliminarUsuario(int indice) {
        indice--;
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                lista[i] = lista[i + 1];
            }
            contador--;
            System.out.println("usuario eliminado correctamente.");
        } else {
            System.out.println("indice invalido.");
        }
    }
}