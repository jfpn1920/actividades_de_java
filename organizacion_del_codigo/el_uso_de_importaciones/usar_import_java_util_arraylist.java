package el_uso_de_importaciones;
import java.util.ArrayList;
public class usar_import_java_util_arraylist {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("ana");
        nombres.add("carlos");
        nombres.add("maria");
        nombres.add("luis");
        System.out.println("lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}