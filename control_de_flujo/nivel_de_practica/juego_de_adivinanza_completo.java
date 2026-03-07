package nivel_de_practica;
import java.util.Scanner;
import java.util.Random;
public class juego_de_adivinanza_completo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int numeroUsuario = 0;
        int intentos = 0;
        System.out.println("juego de adivinanza");
        System.out.println("adivina el numero entre 1 y 100");
        while (numeroUsuario != numeroSecreto) {
            System.out.print("ingrese su numero: ");
            numeroUsuario = scanner.nextInt();
            intentos++;
            if (numeroUsuario < numeroSecreto) {
                System.out.println("el numero es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("el numero es menor.");
            } else {
                System.out.println("correcto, Adivinaste el numero.");
                System.out.println("intentos realizados: " + intentos);
            }
        }
        scanner.close();
    }
}