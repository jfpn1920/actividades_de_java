package refactorizacion_de_practica;
import java.util.ArrayList;
import java.util.List;
public class organizar_imports {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("juan");
        nombres.add("maria");
        nombres.add("carlos");
        mostrarNombres(nombres);
    }
    /**
     * Método que muestra los nombres almacenados en una lista
     * @param lista lista de nombres
     */
    public static void mostrarNombres(List<String> lista) {
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}