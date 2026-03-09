package recorrer_arraylist_con_for;
import java.util.ArrayList;
public class crear_mini_menu_con_lista {
    public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1. ver productos");
        menu.add("2. agregar producto");
        menu.add("3. eliminar producto");
        menu.add("4. salir");
        System.out.println("menu de consola");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
    }
}