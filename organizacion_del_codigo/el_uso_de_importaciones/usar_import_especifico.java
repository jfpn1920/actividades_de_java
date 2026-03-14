package el_uso_de_importaciones;
import java.util.Scanner;
public class usar_import_especifico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = entrada.nextInt();
        System.out.println("el numero ingresado fue: " + numero);
        entrada.close();
    }
}