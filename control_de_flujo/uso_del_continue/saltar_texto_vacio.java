package uso_del_continue;
import java.util.Scanner;
public class saltar_texto_vacio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese un texto: ");
            texto = scanner.nextLine();
            if (texto.isEmpty()) {
                System.out.println("texto vacio ignorado.");
                continue; 
            }
            System.out.println("texto ingresado: " + texto);
        }
        scanner.close();
    }
}