package uso_combinado_de_int_double_y_string;
import java.util.Scanner;
public class pedir_nombre_y_3_notas_y_su_mostrar_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        System.out.print("ingrese la primera nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("ingrese la segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.print("ingrese la tercera nota: ");
        double nota3 = entrada.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("estudiante: " + nombre);
        System.out.println("el promedio de las notas es: " + promedio);
        entrada.close();
    }
}