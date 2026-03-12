package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_calcule_impuesto_segun_salario {
    public static double calcularImpuesto(double salario) {
        double impuesto;
        if (salario < 1000) {
            impuesto = 0;
        } 
        else if (salario <= 3000) {
            impuesto = salario * 0.10;
        } 
        else {
            impuesto = salario * 0.20;
        }
        return impuesto;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el salario: ");
        double salario = scanner.nextDouble();
        double impuesto = calcularImpuesto(salario);
        System.out.println("el impuesto a pagar es: " + impuesto);
        scanner.close();
    }
}