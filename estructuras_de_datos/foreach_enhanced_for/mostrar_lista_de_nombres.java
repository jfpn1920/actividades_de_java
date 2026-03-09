package foreach_enhanced_for;
public class mostrar_lista_de_nombres {
    public static void main(String[] args) {
        String[] nombres = {"ana", "luis", "carlos", "marta", "sofia"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}