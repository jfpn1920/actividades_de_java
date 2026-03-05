package switch_menu_de_navegacion;
import java.util.Scanner;
public class sistema_de_menu_restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu del restaurante");
        System.out.println("1. pizza");
        System.out.println("2. Hamburguesa");
        System.out.println("3. Ensalada");
        System.out.println("4. Pasta");
        System.out.print("seleccione un plato (1-4): ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("has seleccionado: pizza");
                break;
            case 2:
                System.out.println("has seleccionado: hamburguesa");
                break;
            case 3:
                System.out.println("has seleccionado: ensalada");
                break;
            case 4:
                System.out.println("has seleccionado: pasta");
                break;
            default:
                System.out.println("opcion invalida, debe elegir la opcion (1-4).");
        }
        scanner.close();
    }
}