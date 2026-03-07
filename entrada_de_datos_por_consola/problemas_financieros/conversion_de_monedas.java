package problemas_financieros;
import java.util.Scanner;
public class conversion_de_monedas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la cantidad de dinero a convertir: ");
        double monto = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.print("ingrese la moneda de origen: ");
        String monedaOrigen = entrada.nextLine();
        System.out.print("ingrese la moneda de destino: ");
        String monedaDestino = entrada.nextLine();
        System.out.print("ingrese la tasa de conversion de " + monedaOrigen + " a " + monedaDestino + ": ");
        double tasa = entrada.nextDouble();
        double montoConvertido = monto * tasa;
        System.out.println("\n conversion de monedas ");
        System.out.println("monto original: " + monto + " " + monedaOrigen);
        System.out.println("monto convertido: " + montoConvertido + " " + monedaDestino);
        entrada.close();
    }
}