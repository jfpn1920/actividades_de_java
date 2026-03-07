package operaciones_matematicas;
import java.util.Scanner;
public class calcular_interes_simple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el capital: ");
        double capital = entrada.nextDouble();
        System.out.print("ingrese la tasa de interes como 0.05 para 5%: ");
        double tasa = entrada.nextDouble();
        System.out.print("ingrese el tiempo en años: ");
        double tiempo = entrada.nextDouble();
        double interes = capital * tasa * tiempo;
        System.out.println("el interes simple es: " + interes);
        entrada.close();
    }
}