package introduccion_a_excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;
public class leer_entero_invalido_con_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("ingrese un numero entero: ");
            int numero = sc.nextInt();
            System.out.println("numero ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("error: debes ingresar un numero entero valido.");
        }
        System.out.println("el programa continua ejecutandose.");
        sc.close();
    }
}