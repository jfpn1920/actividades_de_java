package operaciones_matematicas;
import java.util.Scanner;
public class calcular_salario_mensual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese las horas trabajadas en el mes: ");
        double horasTrabajadas = entrada.nextDouble();
        System.out.print("ingrese el pago por hora: ");
        double pagoPorHora = entrada.nextDouble();
        double salarioMensual = horasTrabajadas * pagoPorHora;
        System.out.println("el salario mensual es: " + salarioMensual);
        entrada.close();
    }
}