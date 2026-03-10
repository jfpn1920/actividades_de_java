package integracion_total;
import java.util.Scanner;
public class menu_con_validaciones_fuertes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n menu pricipal ");
            System.out.println("1. saludar");
            System.out.println("2. mostrar fecha simulada");
            System.out.println("3. mostrar mensaje motivacional");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = entrada.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("error: debe elegir una opcion entre 1 y 4.");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.println("hola, bienvenido al sistema.");
                            break;
                        case 2:
                            System.out.println("hoy es un gran dia para programar en java.");
                            break;
                        case 3:
                            System.out.println("sigue aprendiendo, cada linea de codigo cuenta.");
                            break;
                        case 4:
                            System.out.println("saliendo del sistema...");
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("error: debe ingresar un numero valido.");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 4);
        entrada.close();
    }
}