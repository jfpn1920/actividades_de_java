package nivel_de_practica;
import java.util.Scanner;
public class sistema_con_multiples_metodos_organizados {
    public static void mostrarMenu() {
        System.out.println("\n sistema de numeros ---");
        System.out.println("1. registrar numero");
        System.out.println("2. mostrar numeros");
        System.out.println("3. sumar numeros");
        System.out.println("4. calcular promedio");
        System.out.println("5. salir");
        System.out.print("seleccione una opcion: ");
    }
    public static void registrarNumero(int[] numeros, Scanner scanner, int indice) {
        System.out.print("ingrese un numero: ");
        numeros[indice] = scanner.nextInt();
        System.out.println("numero registrado correctamente.");
    }
    public static void mostrarNumeros(int[] numeros) {
        System.out.println("\n lista de numeros:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                System.out.println((i + 1) + ". " + numeros[i]);
            }
        }
    }
    public static int sumarNumeros(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }
    public static double calcularPromedio(int[] numeros, int cantidad) {
        if (cantidad == 0) {
            return 0;
        }
        return (double) sumarNumeros(numeros) / cantidad;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    if (contador < numeros.length) {
                        registrarNumero(numeros, scanner, contador);
                        contador++;
                    } else {
                        System.out.println("no se pueden registrar mas numeros.");
                    }
                    break;
                case 2:
                    mostrarNumeros(numeros);
                    break;
                case 3:
                    int suma = sumarNumeros(numeros);
                    System.out.println("la suma total es: " + suma);
                    break;
                case 4:
                    double promedio = calcularPromedio(numeros, contador);
                    System.out.println("el promedio es: " + promedio);
                    break;
                case 5:
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}