package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_ciudad_y_pais_y_mostrarlos_formateados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.print("ingrese su pais: ");
        String pais = entrada.nextLine();
        System.out.println("ciudad: " + ciudad + " - pais: " + pais);
        entrada.close();
    }
}