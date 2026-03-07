package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double exponente;
        double resultado;
        System.out.print("ingrese la base: ");
        base = entrada.nextDouble();
        System.out.print("ingrese el exponente: ");
        exponente = entrada.nextDouble();
        resultado = Math.pow(base, exponente);
        System.out.println("\nel resultado de la potencia es: " + resultado);
        entrada.close();
    }
}