package problemas_con_multiples_entradas;
import java.util.Scanner;
public class pedir_5_notas_y_promediarlas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("ingrese la nota " + i + ": ");
            double nota = entrada.nextDouble();
            suma += nota;
        }
        double promedio = suma / 5;
        System.out.println("\n el promedio de las 5 notas es: " + promedio);
        entrada.close();
    }
}