package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_datos_de_un_carro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la marca del carro: ");
        String marca = entrada.nextLine();
        System.out.print("ingrese el modelo o año del carro: ");
        int modelo = entrada.nextInt();
        System.out.print("ingrese el precio del carro: ");
        double precio = entrada.nextDouble();
        System.out.println("\n datos del carro");
        System.out.println("marca: " + marca);
        System.out.println("modelo/Año: " + modelo);
        System.out.println("precio: " + precio);
        entrada.close();
    }
}