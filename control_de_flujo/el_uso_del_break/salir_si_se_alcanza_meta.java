package el_uso_del_break;
import java.util.Scanner;
public class salir_si_se_alcanza_meta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;
        int meta = 100;
        int ingreso;
        System.out.println("alcanzar meta de puntos");
        System.out.println("meta a alcanzar: " + meta + " puntos");
        while (true) {
            System.out.print("ingrese puntos obtenidos: ");
            ingreso = scanner.nextInt();
            puntos += ingreso;
            System.out.println("puntos acumulados: " + puntos);
            if (puntos >= meta) {
                System.out.println("meta alcanzada");
                break; 
            }
        }
        System.out.println("programa finalizado.");
        scanner.close();
    }
}