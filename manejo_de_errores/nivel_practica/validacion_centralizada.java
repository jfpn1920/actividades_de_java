package nivel_practica;
import java.util.Scanner;
public class validacion_centralizada {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        GestorProductos gestor = new GestorProductos();
        int opcion;
        do {
            System.out.println("\n sistema con validacion centralizado ");
            System.out.println("1. agregar producto");
            System.out.println("2. mostrar productos");
            System.out.println("3. eliminar producto");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            opcion = leerEntero();
            switch (opcion) {
                case 1:
                    System.out.print("ingrese nombre del producto: ");
                    String nombre = leerTexto();
                    gestor.agregarProducto(nombre);
                    break;
                case 2:
                    gestor.mostrarProductos();
                    break;
                case 3:
                    System.out.print("ingrese numero del producto a eliminar: ");
                    int indice = leerEntero();
                    gestor.eliminarProducto(indice);
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        entrada.close();
    }
    public static int leerEntero() {
        while (true) {
            try {
                int numero = entrada.nextInt();
                entrada.nextLine();
                return numero;
            } catch (Exception e) {
                System.out.print("error: ingrese un numero valido: ");
                entrada.nextLine();
            }
        }
    }
    public static String leerTexto() {
        String texto = entrada.nextLine();
        if (texto.trim().isEmpty()) {
            System.out.print("error: ingrese texto valido: ");
            return leerTexto();
        }
        return texto;
    }
}
class Producto {
    String nombre;
    public Producto(String nombre) {
        this.nombre = nombre;
    }
}
class GestorProductos {
    Producto[] lista = new Producto[5];
    int contador = 0;
    public void agregarProducto(String nombre) {
        if (contador < lista.length) {
            lista[contador] = new Producto(nombre);
            contador++;
            System.out.println("producto agregado correctamente.");
        } else {
            System.out.println("inventario lleno.");
        }
    }
    public void mostrarProductos() {
        if (contador == 0) {
            System.out.println("no hay productos registrados.");
            return;
        }
        System.out.println("\n lista de productos:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + lista[i].nombre);
        }
    }
    public void eliminarProducto(int indice) {
        indice = indice - 1;
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                lista[i] = lista[i + 1];
            }
            contador--;
            System.out.println("producto eliminado correctamente.");
        } else {
            System.out.println("producto no valido.");
        }
    }
}