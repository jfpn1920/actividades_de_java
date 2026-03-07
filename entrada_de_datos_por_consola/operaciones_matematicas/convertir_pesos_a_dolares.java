package operaciones_matematicas;
import java.util.Scanner;
public class convertir_pesos_a_dolares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la cantidad en pesos: ");
        double pesos = entrada.nextDouble();
        double tasaCambio = 4000; 
        double dolares = pesos / tasaCambio;
        System.out.println("la cantidad en dolares es: " + dolares);
        entrada.close();
    }
}