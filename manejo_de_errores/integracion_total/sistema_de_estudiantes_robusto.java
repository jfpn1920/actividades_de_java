package integracion_total;
import java.util.Scanner;
public class sistema_de_estudiantes_robusto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] notas = new double[5];
        int opcion;
        int contador = 0;
        do {
            System.out.println("\n sistema de estudiantes");
            System.out.println("1. registrar estudiante");
            System.out.println("2. mostrar estudiantes");
            System.out.println("3. calcular promedio general");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = entrada.nextInt();
                entrada.nextLine(); 
                switch (opcion) {
                    case 1:
                        if (contador < nombres.length) {
                            System.out.print("ingrese el nombre del estudiante: ");
                            nombres[contador] = entrada.nextLine();
                            System.out.print("ingrese la nota del estudiante: ");
                            notas[contador] = entrada.nextDouble();
                            if (notas[contador] < 0 || notas[contador] > 5) {
                                System.out.println("error: la nota debe estar entre 0 y 5");
                            } else {
                                contador++;
                                System.out.println("estudiante registrado correctamente.");
                            }
                        } else {
                            System.out.println("no se pueden registrar mas estudiantes.");
                        }
                        break;
                    case 2:
                        if (contador == 0) {
                            System.out.println("no hay estudiantes registrados.");
                        } else {
                            System.out.println("\n lista de estudiantes:");
                            for (int i = 0; i < contador; i++) {
                                System.out.println((i + 1) + ". " + nombres[i] + " - Nota: " + notas[i]);
                            }
                        }
                        break;
                    case 3:
                        if (contador == 0) {
                            System.out.println("no hay notas para calcular promedio.");
                        } else {
                            double suma = 0;
                            for (int i = 0; i < contador; i++) {
                                suma += notas[i];
                            }
                            double promedio = suma / contador;
                            System.out.println("el promedio general es: " + promedio);
                        }
                        break;
                    case 4:
                        System.out.println("saliendo del sistema...");
                        break;
                    default:
                        System.out.println("ppcion invalida.");
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