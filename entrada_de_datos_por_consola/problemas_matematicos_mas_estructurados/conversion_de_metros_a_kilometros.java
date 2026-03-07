package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class conversion_de_metros_a_kilometros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double metros;
        double kilometros;
        System.out.print("ingrese la cantidad de metros: ");
        metros = entrada.nextDouble();
        kilometros = metros / 1000;
        System.out.println("\nel la distancia en kilómetros es: " + kilometros + " km");
        entrada.close();
    }
}