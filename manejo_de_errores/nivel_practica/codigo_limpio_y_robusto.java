package nivel_practica;
import java.util.Scanner;
public class codigo_limpio_y_robusto {
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        app.iniciar();
    }
}
class Aplicacion {
    private Scanner scanner = new Scanner(System.in);
    private GestorTareas gestor = new GestorTareas();
    public void iniciar() {
        Logger.info("aplicacion iniciada");
        int opcion;
        do {
            mostrarMenu();
            opcion = Entrada.leerEntero(scanner, "seleccione una opcion: ");
            ejecutarOpcion(opcion);
        } while (opcion != 4);
        Logger.info("aplicacion finalizada");
        scanner.close();
    }
    private void mostrarMenu() {
        System.out.println("\n gestor de tareas ");
        System.out.println("1. agregar tarea");
        System.out.println("2. mostrar tareas");
        System.out.println("3. eliminar tarea");
        System.out.println("4. salir");
    }
    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                String tarea = Entrada.leerTexto(scanner, "ingrese la tarea: ");
                gestor.agregarTarea(tarea);
                break;
            case 2:
                gestor.mostrarTareas();
                break;
            case 3:
                int indice = Entrada.leerEntero(scanner, "numero de tarea a eliminar: ");
                gestor.eliminarTarea(indice);
                break;
            case 4:
                System.out.println("saliendo del sistema...");
                break;
            default:
                System.out.println("opcion invalida.");
        }
    }
}
class Entrada {
    public static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("error: debe ingresar un numero valido.");
            }
        }
    }
    public static String leerTexto(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("error: el texto no puede estar vacio.");
        }
    }
}
class Logger {
    public static void info(String mensaje) {
        System.out.println("[info] " + mensaje);
    }
    public static void error(String mensaje) {
        System.out.println("[error] " + mensaje);
    }
}
class Tarea {
    String descripcion;
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }
}
class GestorTareas {
    private Tarea[] tareas = new Tarea[20];
    private int contador = 0;
    public void agregarTarea(String descripcion) {
        if (contador < tareas.length) {
            tareas[contador] = new Tarea(descripcion);
            contador++;
            Logger.info("tarea agregada: " + descripcion);
        } else {
            Logger.error("no hay espacio para mas tareas");
        }
    }
    public void mostrarTareas() {
        if (contador == 0) {
            System.out.println("no hay tareas registradas.");
            return;
        }
        System.out.println("\n lista de tareas:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + tareas[i].descripcion);
        }
    }
    public void eliminarTarea(int indice) {
        indice--;
        if (indice < 0 || indice >= contador) {
            Logger.error("indice invalido");
            System.out.println("indice incorrecto.");
            return;
        }
        String tareaEliminada = tareas[indice].descripcion;
        for (int i = indice; i < contador - 1; i++) {
            tareas[i] = tareas[i + 1];
        }
        contador--;
        Logger.info("tarea eliminada: " + tareaEliminada);
    }
}