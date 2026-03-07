package operaciones_matematicas;
import java.util.Scanner;
public class calcular_perimetro_de_un_circulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el radio del circulo: ");
        double radio = entrada.nextDouble();
        double perimetro = 2 * Math.PI * radio;
        System.out.println("el perimetro del circulo es: " + perimetro);
        entrada.close();
    }
}