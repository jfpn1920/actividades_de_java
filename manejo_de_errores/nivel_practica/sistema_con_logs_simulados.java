package nivel_practica;
import java.util.Scanner;
public class sistema_con_logs_simulados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestorUsuarios gestor = new GestorUsuarios();
        LoggerSimulado.info("sistema iniciado.");
        int opcion;
        do {
            System.out.println("\n sistema de logs ");
            System.out.println("1. agregar usuario");
            System.out.println("2. mostrar usuarios");
            System.out.println("3. eliminar usuario");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = Integer.parseInt(entrada.nextLine());
            } catch (Exception e) {
                LoggerSimulado.error("entrada invalida detectada.");
                System.out.println("debe ingresar un numero.");
                opcion = 0;
            }
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
                    try {
                        int indice = Integer.parseInt(entrada.nextLine());
                        gestor.eliminarUsuario(indice);
                    } catch (Exception e) {
                        LoggerSimulado.error("error al intentar eliminar usuario.");
                        System.out.println("numero invalido.");
                    }
                    break;
                case 4:
                    LoggerSimulado.info("sistema finalizado.");
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
                    LoggerSimulado.warning("usuario ingreso opcion invalida.");
            }
        } while (opcion != 4);
        entrada.close();
    }
}
class LoggerSimulado {
    public static void info(String mensaje) {
        System.out.println("[info] " + mensaje);
    }
    public static void warning(String mensaje) {
        System.out.println("[warking] " + mensaje);
    }
    public static void error(String mensaje) {
        System.out.println("[error] " + mensaje);
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
            LoggerSimulado.info("usuario agregado: " + nombre);
        } else {
            LoggerSimulado.warning("intento de agregar usuario con lista llena.");
            System.out.println("no hay espacio para mas usuarios.");
        }
    }
    public void mostrarUsuarios() {
        if (contador == 0) {
            LoggerSimulado.warning("se intento mostrar usuarios pero la lista esta vacia.");
            System.out.println("no hay usuarios registrados.");
            return;
        }
        System.out.println("\n lista de usuarios:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + lista[i].nombre);
        }
        LoggerSimulado.info("se mostro la lista de usuarios.");
    }
    public void eliminarUsuario(int indice) {
        indice--;
        if (indice >= 0 && indice < contador) {
            String nombre = lista[indice].nombre;
            for (int i = indice; i < contador - 1; i++) {
                lista[i] = lista[i + 1];
            }
            contador--;
            System.out.println("usuario eliminado correctamente.");
            LoggerSimulado.info("usuario eliminado: " + nombre);
        } else {
            LoggerSimulado.error("intento de eliminar usuario con indice invalido.");
            System.out.println("indice invalido.");
        }
    }
}