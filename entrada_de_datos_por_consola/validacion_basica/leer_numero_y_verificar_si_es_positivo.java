package validacion_basica;
import java.util.Scanner;
public class leer_numero_y_verificar_si_es_positivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        double numero = entrada.nextDouble();
        if (numero > 0) {
            System.out.println("el numero es positivo.");
        } else if (numero == 0) {
            System.out.println("el numero es cero.");
        } else {
            System.out.println("el numero es negativo.");
        }
        entrada.close();
    }
}