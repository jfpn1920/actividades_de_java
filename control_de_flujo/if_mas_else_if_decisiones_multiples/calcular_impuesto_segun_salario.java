package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class calcular_impuesto_segun_salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su salario: ");
        double salario = scanner.nextDouble();
        double impuesto;
        if (salario <= 1000) {
            impuesto = 0;
        } else if (salario <= 2000) {
            impuesto = salario * 0.10;
        } else if (salario <= 5000) {
            impuesto = salario * 0.20;
        } else {
            impuesto = salario * 0.30;
        }
        System.out.println("el impuesto a pagar es: " + impuesto);
        scanner.close();
    }
}