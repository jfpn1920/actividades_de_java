package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class mini_sistema_con_foreach {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("laptop");
        productos.add("mouse");
        productos.add("teclado");
        productos.add("monitor");
        productos.add("auriculares");
        System.out.println("mini sistema de productos");
        System.out.println("productos disponibles:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
        System.out.println("fin del sistema");
    }
}