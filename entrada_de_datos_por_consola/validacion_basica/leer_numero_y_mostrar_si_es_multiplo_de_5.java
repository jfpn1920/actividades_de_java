package validacion_basica;
import java.util.Scanner;
public class leer_numero_y_mostrar_si_es_multiplo_de_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = entrada.nextInt();
        if (numero % 5 == 0) {
            System.out.println("el numero es multiplo de 5.");
        } else {
            System.out.println("el numero no es multiplo de 5.");
        }
        entrada.close();
    }
}