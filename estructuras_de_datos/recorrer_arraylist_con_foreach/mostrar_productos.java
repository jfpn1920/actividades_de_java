package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class mostrar_productos {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("laptop");
        productos.add("mouse");
        productos.add("teclado");
        productos.add("monitor");
        productos.add("audifonos");
        System.out.println("lista de productos:");
        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}