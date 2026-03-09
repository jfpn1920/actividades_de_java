package introduccion_a_arraylist;
import java.util.ArrayList;
public class importar_java_util_arraylist {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("juan");
        nombres.add("maria");
        nombres.add("carlos");
        System.out.println("lista de nombres: " + nombres);
    }
}