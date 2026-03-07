package problemas_financieros;
import java.util.Scanner;
public class calcular_rentabilidad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la inversion inicial: ");
        double inversion = entrada.nextDouble();
        System.out.print("ingrese la ganancia obtenida: ");
        double ganancia = entrada.nextDouble();
        double rentabilidad = (ganancia / inversion) * 100;
        System.out.println("\n resultado de rentabilidad ");
        System.out.println("inversion inicial: " + inversion);
        System.out.println("ganancia obtenida: " + ganancia);
        System.out.println("rentabilidad %: " + rentabilidad);
        entrada.close();
    }
}