package nivel_practica;
import java.util.Scanner;
public class proyecto_final_integrando_todo {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.iniciar();
    }
}
class Sistema {
    private Scanner entrada = new Scanner(System.in);
    private GestorUsuarios gestorUsuarios = new GestorUsuarios();
    private GestorProductos gestorProductos = new GestorProductos();
    private GestorVentas gestorVentas = new GestorVentas(gestorProductos);
    public void iniciar() {
        Logger.info("sistema iniciado");
        int opcion;
        do {
            mostrarMenu();
            opcion = Entrada.leerEntero(entrada, "seleccione una opcion: ");
            try {
                ejecutarOpcion(opcion);
            } catch (Exception e) {
                Logger.error("error inesperado en el sistema");
                System.out.println("ocurrio un error en la operacion.");
            }
        } while (opcion != 6);
        Logger.info("sistema finalizado");
        entrada.close();
    }
    private void mostrarMenu() {
        System.out.println("\n sistema empresarial ");
        System.out.println("1. agregar usuario");
        System.out.println("2. mostrar usuarios");
        System.out.println("3. agregar producto");
        System.out.println("4. mostrar productos");
        System.out.println("5. registrar venta");
        System.out.println("6. salir");
    }
    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                String nombre = Entrada.leerTexto(entrada, "nombre del usuario: ");
                gestorUsuarios.agregarUsuario(nombre);
                break;
            case 2:
                gestorUsuarios.mostrarUsuarios();
                break;
            case 3:
                String producto = Entrada.leerTexto(entrada, "nombre del producto: ");
                double precio = Entrada.leerDecimal(entrada, "precio: ");
                gestorProductos.agregarProducto(producto, precio);
                break;
            case 4:
                gestorProductos.mostrarProductos();
                break;
            case 5:
                gestorVentas.registrarVenta(entrada);
                break;
            case 6:
                System.out.println("saliendo del sistema...");
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
                System.out.println("debe ingresar un numero valido.");
            }
        }
    }
    public static double leerDecimal(Scanner entrada, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(entrada.nextLine());
            } catch (Exception e) {
                System.out.println("debe ingresar un numero decimal valido.");
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
            System.out.println("el texto no puede estar vacio.");
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
class Usuario {
    String nombre;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}
class Producto {
    String nombre;
    double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
class GestorUsuarios {
    private Usuario[] usuarios = new Usuario[10];
    private int contador = 0;
    public void agregarUsuario(String nombre) {
        if (contador < usuarios.length) {
            usuarios[contador] = new Usuario(nombre);
            contador++;
            Logger.info("usuario agregado: " + nombre);
        } else {
            System.out.println("no hay espacio para mas usuarios.");
        }
    }
    public void mostrarUsuarios() {
        if (contador == 0) {
            System.out.println("no hay usuarios registrados.");
            return;
        }
        System.out.println("\n usuarios:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + usuarios[i].nombre);
        }
    }
}
class GestorProductos {
    Producto[] productos = new Producto[10];
    int contador = 0;
    public void agregarProducto(String nombre, double precio) {
        if (contador < productos.length) {
            productos[contador] = new Producto(nombre, precio);
            contador++;
            Logger.info("producto agregado: " + nombre);
        } else {
            System.out.println("inventario lleno.");
        }
    }
    public void mostrarProductos() {
        if (contador == 0) {
            System.out.println("no hay productos.");
            return;
        }
        System.out.println("\n productos:");
        for (int i = 0; i < contador; i++) {
            System.out.println(
                    (i + 1) + ". " +
                    productos[i].nombre +
                    " - $" + productos[i].precio
            );
        }
    }
}
class GestorVentas {
    private String[] ventas = new String[10];
    private int contador = 0;
    private GestorProductos productos;
    public GestorVentas(GestorProductos productos) {
        this.productos = productos;
    }
    public void registrarVenta(Scanner entrada) {
        if (productos.contador == 0) {
            System.out.println("no hay productos registrados.");
            return;
        }
        System.out.println("\n productos disponibles:");
        for (int i = 0; i < productos.contador; i++) {
            System.out.println(
                    (i + 1) + ". " +
                    productos.productos[i].nombre +
                    " - $" + productos.productos[i].precio
            );
        }
        int indice = Entrada.leerEntero(entrada, "seleccione producto: ") - 1;
        if (indice >= 0 && indice < productos.contador) {
            ventas[contador] = productos.productos[indice].nombre;
            contador++;
            Logger.info("venta registrada: " + productos.productos[indice].nombre);
        } else {
            System.out.println("producto invalido.");
        }
    }
}