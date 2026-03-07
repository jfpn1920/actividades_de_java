package validacion_basica;
import java.util.Scanner;
public class leer_temperatura_y_mostrar_estado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la temperatura en °c: ");
        double temperatura = entrada.nextDouble();
        if (temperatura < 0) {
            System.out.println("estado: congelado");
        } else if (temperatura <= 25) {
            System.out.println("estado: frio");
        } else if (temperatura <= 35) {
            System.out.println("estado: templado");
        } else {
            System.out.println("estado: caliente");
        }
        entrada.close();
    }
}