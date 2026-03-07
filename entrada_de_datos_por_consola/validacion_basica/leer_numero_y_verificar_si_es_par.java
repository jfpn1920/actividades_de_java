package validacion_basica;
import java.util.Scanner;
public class leer_numero_y_verificar_si_es_par {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("el numero es par.");
        } else {
            System.out.println("el numero es impar.");
        }
        entrada.close();
    }
}