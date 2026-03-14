package el_uso_de_importaciones;
import java.util.ArrayList;
public class probar_import_incorrecto {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("elemento 1");
        lista.add("elemento 2");
        System.out.println("contenido de la lista: " + lista);
    }
}