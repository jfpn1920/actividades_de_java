package operaciones_matematicas;
import java.util.Scanner;
public class calcular_area_de_un_triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la base del triangulo: ");
        double base = entrada.nextDouble();
        System.out.print("ingrese la altura del triangulo: ");
        double altura = entrada.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("el area del triangulo es: " + area);
        entrada.close();
    }
}