package recorrer_arraylist_con_foreach;
import java.util.ArrayList;
public class buscar_palabra_especifica {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("java");
        palabras.add("python");
        palabras.add("c++");
        palabras.add("javaScript");
        String palabraBuscada = "python";
        boolean encontrada = false;
        for (String palabra : palabras) {
            if (palabra.equals(palabraBuscada)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("la palabra '" + palabraBuscada + "' esta en la lista.");
        } else {
            System.out.println("la palabra no se encuentra en la lista.");
        }
    }
}