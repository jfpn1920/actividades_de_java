package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class determinar_estacion_segun_mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el numero del mes (1-12): ");
        int mes = scanner.nextInt();
        if (mes == 12 || mes == 1 || mes == 2) {
            System.out.println("la estacion es invierno.");
        } 
        else if (mes >= 3 && mes <= 5) {
            System.out.println("la estacion es primavera.");
        } 
        else if (mes >= 6 && mes <= 8) {
            System.out.println("la estacion es verano.");
        } 
        else if (mes >= 9 && mes <= 11) {
            System.out.println("la estacion es otoño.");
        } 
        else {
            System.out.println("mes invalido.");
        }
        scanner.close();
    }
}