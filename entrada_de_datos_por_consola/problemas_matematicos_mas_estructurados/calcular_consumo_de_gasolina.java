package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_consumo_de_gasolina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double litros;
        double distancia;
        double consumo;
        System.out.print("ingrese los litros de gasolina consumidos: ");
        litros = entrada.nextDouble();
        System.out.print("ingrese la distancia recorrida km: ");
        distancia = entrada.nextDouble();
        consumo = (litros / distancia) * 100;
        System.out.println("\nel consumo promedio de gasolina es: " + consumo + " L/100 km");
        entrada.close();
    }
}