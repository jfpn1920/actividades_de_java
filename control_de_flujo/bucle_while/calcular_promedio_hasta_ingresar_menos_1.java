package bucle_while;
import java.util.Scanner;
public class calcular_promedio_hasta_ingresar_menos_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        System.out.println("ingrese numeros para calcular el promedio, ingrese -1 para terminar.");
        while (true) {
            System.out.print("ingrese un numero: ");
            numero = scanner.nextInt();
            if (numero == -1) {
                break; 
            }
            suma += numero;
            contador++;
        }
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("el promedio de los numeros ingresados es: " + promedio);
        } else {
            System.out.println("no se ingresaron numeros para calcular promedio.");
        }
        scanner.close();
    }
}