package fundamentos_de_scanner;
import java.util.Scanner;
public class pedir_dos_decimales_y_multiplicarlos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el primer numero decimal: ");
        double numero1 = entrada.nextDouble();
        System.out.print("ingrese el segundo numero decimal: ");
        double numero2 = entrada.nextDouble();
        double multiplicacion = numero1 * numero2;
        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
        entrada.close();
    }
}