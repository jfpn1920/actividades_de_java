package metodos_mas_bucles;
import java.util.Scanner;
public class metodo_que_valide_datos_hasta_correctos {
    public static int validarNumero(Scanner scanner) {
        int numero;
        do {
            System.out.print("ingrese un numero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("numero incorrecto, debe ser positivo.");
            }
        } while (numero <= 0);
        return numero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroValido = validarNumero(scanner);
        System.out.println("numero valido ingresado: " + numeroValido);
        scanner.close(); 
    }
}