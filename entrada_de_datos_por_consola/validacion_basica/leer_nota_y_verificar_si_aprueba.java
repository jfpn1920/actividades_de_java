package validacion_basica;
import java.util.Scanner;
public class leer_nota_y_verificar_si_aprueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la nota del estudiante: ");
        double nota = entrada.nextDouble();
        if (nota >= 3.0) {
            System.out.println("el estudiante aprueba.");
        } else {
            System.out.println("el estudiante no aprueba.");
        }
        entrada.close();
    }
}