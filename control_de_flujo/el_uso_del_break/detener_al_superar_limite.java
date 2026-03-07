package el_uso_del_break;
import java.util.Scanner;
public class detener_al_superar_limite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int limite = 100;
        System.out.println("sumar numeros hasta superar el limite");
        System.out.println("limite establecido: " + limite);
        while (true) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();
            suma += numero;
            System.out.println("suma actual: " + suma);
            if (suma > limite) {
                System.out.println("se supero el limite permitido.");
                break;
            }
        }
        System.out.println("programa finalizado.");
        scanner.close();
    }
}