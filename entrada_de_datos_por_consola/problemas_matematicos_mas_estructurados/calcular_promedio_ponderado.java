package problemas_matematicos_mas_estructurados;
import java.util.Scanner;
public class calcular_promedio_ponderado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3;
        double peso1, peso2, peso3;
        double promedio;
        System.out.print("ingrese la nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.print("ingrese el peso de la nota 1: ");
        peso1 = entrada.nextDouble();
        System.out.print("ingrese la nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.print("ingrese el peso de la nota 2: ");
        peso2 = entrada.nextDouble();
        System.out.print("ingrese la nota 3: ");
        nota3 = entrada.nextDouble();
        System.out.print("ingrese el peso de la nota 3: ");
        peso3 = entrada.nextDouble();
        promedio = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        System.out.println("\nel promedio ponderado es: " + promedio);
        entrada.close();
    }
}