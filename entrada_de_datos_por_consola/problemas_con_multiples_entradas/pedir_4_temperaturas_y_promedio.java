package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_4_temperaturas_y_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("ingrese la temperatura " + i + ": ");
            double temp = entrada.nextDouble();
            suma += temp;
        }
        double promedio = suma / 4;
        System.out.println("\n el promedio de las 4 temperaturas es: " + promedio);
        entrada.close();
    }
}