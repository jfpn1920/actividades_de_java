package switch_menu_de_navegacion;
import java.util.Scanner;
public class Dia_de_la_semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero del 1 al 7: ");
        int dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("numero invalido, debe ser entre 1 y 7.");
        }
        scanner.close();
    }
}