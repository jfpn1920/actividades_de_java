package if_mas_else_if_decisiones_multiples;
import java.util.Scanner;
public class clasificar_imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("su imc es: " + imc);
        if (imc < 18.5) {
            System.out.println("clasificacion: bajo peso");
        } 
        else if (imc < 25) {
            System.out.println("clasificacion: normal");
        } 
        else if (imc < 30) {
            System.out.println("clasificacion: sobrepeso");
        } 
        else {
            System.out.println("clasificacion: obesidad");
        }
        scanner.close();
    }
}