package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class conversion_de_horas_a_minutos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double horas;
        double minutos;
        System.out.print("ingrese la cantidad de horas: ");
        horas = entrada.nextDouble();
        minutos = horas * 60;
        System.out.println("\nla cantidad en minutos es: " + minutos + " minutos");
        entrada.close();
    }
}