package validacion_basica;
import java.util.Scanner;
public class leer_texto_y_mostrar_en_mayusculas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un texto: ");
        String texto = entrada.nextLine();
        String textoMayusculas = texto.toUpperCase();
        System.out.println("el texto en mayusculas es: " + textoMayusculas);
        entrada.close();
    }
}