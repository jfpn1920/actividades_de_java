package operaciones_matematicas;
import java.util.Scanner;
public class calcular_edad_en_meses {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su edad en años: ");
        int edadAnios = entrada.nextInt();
        int edadMeses = edadAnios * 12;
        System.out.println("su edad en meses es: " + edadMeses);
        entrada.close();
    }
}