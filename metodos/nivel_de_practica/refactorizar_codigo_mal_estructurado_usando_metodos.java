package nivel_de_practica;
import java.util.Scanner;
public class refactorizar_codigo_mal_estructurado_usando_metodos {
    public static void mostrarMenu() {
        System.out.println("\n sistema de numeros ");
        System.out.println("1. ingresar número");
        System.out.println("2. mostrar suma");
        System.out.println("3. mostrar promedio");
        System.out.println("4. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static int ingresarNumero(Scanner scanner) {
        System.out.print("ingrese un numero: ");
        return scanner.nextInt();
    }
    public static int calcularSuma(int[] numeros, int cantidad) {
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }
        return suma;
    }
    public static double calcularPromedio(int[] numeros, int cantidad) {
        if (cantidad == 0) {
            return 0;
        }
        int suma = calcularSuma(numeros, cantidad);
        return (double) suma / cantidad;
    }
    public static void mostrarNumeros(int[] numeros, int cantidad) {
        System.out.println("\n numeros ingresados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    if (contador < numeros.length) {
                        numeros[contador] = ingresarNumero(scanner);
                        contador++;
                    } else {
                        System.out.println("no se pueden ingresar mas numeros.");
                    }
                    break;
                case 2:
                    int suma = calcularSuma(numeros, contador);
                    System.out.println("la suma total es: " + suma);
                    break;
                case 3:
                    double promedio = calcularPromedio(numeros, contador);
                    System.out.println("el promedio es: " + promedio);
                    break;
                case 4:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}