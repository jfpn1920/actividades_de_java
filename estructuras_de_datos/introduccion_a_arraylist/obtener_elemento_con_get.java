package introduccion_a_arraylist;
import java.util.ArrayList;
public class obtener_elemento_con_get {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        String color = colores.get(1);
        System.out.println("el color obtenido es: " + color);
    }
}