package metodos_mas_control_de_flujo;
import java.util.Scanner;
public class metodo_que_retorne_estado_civil_segun_codigo {
    public static String obtenerEstadoCivil(int codigo) {
        if (codigo == 1) {
            return "soltero";
        } 
        else if (codigo == 2) {
            return "casado";
        } 
        else if (codigo == 3) {
            return "divorciado";
        } 
        else if (codigo == 4) {
            return "viudo";
        } 
        else {
            return "codigo invalido";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el codigo del estado civil: ");
        int codigo = scanner.nextInt();
        String estadoCivil = obtenerEstadoCivil(codigo);
        System.out.println("el estado civil es: " + estadoCivil);
        scanner.close();
    }
}