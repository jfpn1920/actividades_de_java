package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_retorne_categoria {
    public static String obtenerCategoria(int edad) {
        if (edad >= 0 && edad <= 12) {
            return "niño";
        } 
        else if (edad <= 17) {
            return "adolescente";
        } 
        else if (edad <= 59) {
            return "adulto";
        } 
        else {
            return "adulto mayor";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la edad: ");
        int edad = scanner.nextInt();
        String categoria = obtenerCategoria(edad);
        System.out.println("la categoría es: " + categoria);
        scanner.close();
    }
}