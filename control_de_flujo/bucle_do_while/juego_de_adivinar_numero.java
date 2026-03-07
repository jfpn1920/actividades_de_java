package bucle_do_while;
import java.util.Scanner;
public class juego_de_adivinar_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento;
        System.out.println("bienvenido al juego de adivinar el numero");
        System.out.println("intenta adivinar un numero entre 1 y 100.");
        do {
            System.out.print("ingrese su intento: ");
            intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("muy bajo, intente nuevamente.");
            } else if (intento > numeroSecreto) {
                System.out.println("muy alto, intente nuevamente.");
            } else {
                System.out.println("felicidades, adivinaste el numero: " + numeroSecreto);
            }
        } while (intento != numeroSecreto);
        scanner.close();
    }
}