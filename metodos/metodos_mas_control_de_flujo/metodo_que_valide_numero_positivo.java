package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_valide_numero_positivo {
    public static void validarNumero(int numero) {
        if (numero > 0) {
            System.out.println("el numero es positivo");
        } 
        else if (numero < 0) {
            System.out.println("el numero es negativo");
        } 
        else {
            System.out.println("el numero es cero");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        validarNumero(numero);
        scanner.close();
    }
}