package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_6_edades_y_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("ingrese la edad " + i + ": ");
            int edad = entrada.nextInt();
            suma += edad;
        }
        double promedio = (double) suma / 6;
        System.out.println("\n el promedio de las 6 edades es: " + promedio);
        entrada.close();
    }
}