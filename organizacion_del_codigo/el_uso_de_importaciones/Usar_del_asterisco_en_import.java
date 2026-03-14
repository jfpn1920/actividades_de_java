package el_uso_de_importaciones;
import java.util.*;
public class Usar_del_asterisco_en_import {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.print("ingrese un nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.print("ingrese otro nombre: ");
        String nombre2 = entrada.nextLine();
        lista.add(nombre1);
        lista.add(nombre2);
        System.out.println("nombres guardados en la lista:");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
        entrada.close();
    }
}