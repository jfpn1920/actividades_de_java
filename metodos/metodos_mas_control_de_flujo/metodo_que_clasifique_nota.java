package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_clasifique_nota {
    public static void clasificarNota(int nota) {
        if (nota >= 90 && nota <= 100) {
            System.out.println("clasificación: excelente");
        } 
        else if (nota >= 70) {
            System.out.println("clasificacion: bueno");
        } 
        else if (nota >= 60) {
            System.out.println("clasificacion: aprobado");
        } 
        else if (nota >= 0) {
            System.out.println("clasificacion: reprobado");
        } 
        else {
            System.out.println("nota invalida");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        int nota = scanner.nextInt();
        clasificarNota(nota);
        scanner.close();
    }
}