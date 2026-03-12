package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_valide_rango {
    public static void validarRango(int numero) {
        if (numero >= 10 && numero <= 50) {
            System.out.println("el numero esta dentro del rango 10 al 50");
        } else {
            System.out.println("el numero esta fuera del rango 10 al 50");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        validarRango(numero);
        scanner.close();
    }
}