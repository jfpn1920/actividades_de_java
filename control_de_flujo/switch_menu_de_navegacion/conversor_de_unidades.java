package switch_menu_de_navegacion;
import java.util.Scanner;
public class conversor_de_unidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("conversor de unidades");
        System.out.println("1. metros a centimetros");
        System.out.println("2. kilometros a metros");
        System.out.println("3. pulgadas a centimetros");
        System.out.print("seleccione una opcion: ");
        int opcion = scanner.nextInt();
        System.out.print("ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        double resultado;
        switch (opcion) {
            case 1:
                resultado = valor * 100;
                System.out.println(valor + " metros = " + resultado + " centimetros");
                break;
            case 2:
                resultado = valor * 1000;
                System.out.println(valor + " kilometros = " + resultado + " metros");
                break;
            case 3:
                resultado = valor * 2.54;
                System.out.println(valor + " pulgadas = " + resultado + " centimetros");
                break;
            default:
                System.out.println("opcion invalida, debe ser entre 1 y 3.");
        }
        scanner.close();
    }
}