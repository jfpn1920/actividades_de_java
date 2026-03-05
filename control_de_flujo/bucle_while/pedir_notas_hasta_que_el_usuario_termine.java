package bucle_while;
import java.util.Scanner;
public class pedir_notas_hasta_que_el_usuario_termine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";
        int nota;
        int contador = 0;
        int suma = 0;
        while (continuar.equalsIgnoreCase("s")) { 
            System.out.print("ingrese una nota: ");
            nota = scanner.nextInt();
            suma += nota;
            contador++;
            System.out.print("¿desea ingresar otra nota? (s/n): ");
            continuar = scanner.next();
        }
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("se ingresaron " + contador + " notas, promedio: " + promedio);
        } else {
            System.out.println("no se ingresaron notas.");
        }
        scanner.close();
    }
}