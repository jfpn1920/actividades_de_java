package validacion_basica;
import java.util.Scanner;
public class leer_edad_y_verificar_si_es_mayor_de_edad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("es mayor de edad.");
        } else {
            System.out.println("no es mayor de edad.");
        }
        entrada.close();
    }
}