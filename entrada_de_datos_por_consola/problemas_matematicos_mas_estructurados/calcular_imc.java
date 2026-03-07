package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso;
        double altura;
        double imc;
        System.out.print("ingrese su peso en kilogramos: ");
        peso = entrada.nextDouble();
        System.out.print("ingrese su altura en metros: ");
        altura = entrada.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("\nsu indice de masa corporal imc es: " + imc);
        entrada.close();
    }
}