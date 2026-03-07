package operaciones_matematicas;
import java.util.Scanner;
public class calcular_promedio_de_3_numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        double numero1 = entrada.nextDouble();
        System.out.print("ingrese el segundo numero: ");
        double numero2 = entrada.nextDouble();
        System.out.print("ingrese el tercer numero: ");
        double numero3 = entrada.nextDouble();
        double promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("el promedio de los tres numeros es: " + promedio);
        entrada.close();
    }
}