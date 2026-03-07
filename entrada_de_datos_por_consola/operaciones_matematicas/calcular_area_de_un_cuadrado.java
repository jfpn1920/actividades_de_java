package operaciones_matematicas;
import java.util.Scanner;
public class calcular_area_de_un_cuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el valor del lado del cuadrado: ");
        double lado = entrada.nextDouble();
        double area = lado * lado;
        System.out.println("el area del cuadrado es: " + area);
        entrada.close();
    }
}