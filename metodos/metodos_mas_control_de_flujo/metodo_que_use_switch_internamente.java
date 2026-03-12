package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_use_switch_internamente {
    public static String obtenerDia(int numeroDia) {
        switch (numeroDia) {
            case 1:
                return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miercoles";
            case 4:
                return "jueves";
            case 5:
                return "viernes";
            case 6:
                return "sabado";
            case 7:
                return "domingo";
            default:
                return "numero invalido";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero del 1 al 7: ");
        int numero = scanner.nextInt();
        String dia = obtenerDia(numero);
        System.out.println("el dia correspondiente es: " + dia);
        scanner.close();
    }
}