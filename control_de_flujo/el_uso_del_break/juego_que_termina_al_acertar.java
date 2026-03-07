package el_uso_del_break;
import java.util.Scanner;
public class juego_que_termina_al_acertar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7;
        int intento;
        System.out.println("juego de adivinar el numero");
        System.out.println("adivina el numero entre 1 y 10");
        while (true) {
            System.out.print("ingresa tu intento: ");
            intento = scanner.nextInt();
            if (intento == numeroSecreto) {
                System.out.println("felicidades, adivinaste el numero.");
                break; 
            } else {
                System.out.println("numero incorrecto, intenta nuevamente.");
            }
        }
        scanner.close();
    }
}