package introduccion_a_arraylist;
import java.util.ArrayList;
public class mostrar_elementos {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("bogota");
        ciudades.add("medellín");
        ciudades.add("cartagena");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }

}