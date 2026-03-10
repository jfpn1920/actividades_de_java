package integracion_total;
import java.util.Scanner;
public class sistema_academico_completo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = new String[5];
        double[] notas = new double[5];
        int contador = 0;
        int opcion;
        do {
            System.out.println("\n sistema academico ");
            System.out.println("1. registrar estudiante");
            System.out.println("2. ingresar nota");
            System.out.println("3. mostrar estudiantes");
            System.out.println("4. calcular promedio");
            System.out.println("5. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        if (contador < estudiantes.length) {
                            System.out.print("ingrese el nombre del estudiante: ");
                            estudiantes[contador] = entrada.nextLine();
                            notas[contador] = -1; 
                            contador++;
                            System.out.println("estudiante registrado correctamente.");
                        } else {
                            System.out.println("no se pueden registrar mas estudiantes.");
                        }
                        break;
                    case 2:
                        if (contador == 0) {
                            System.out.println("no hay estudiantes registrados.");
                        } else {
                            System.out.print("ingrese el numero del estudiante: ");
                            int indice = entrada.nextInt() - 1;
                            if (indice >= 0 && indice < contador) {
                                System.out.print("ingrese la nota (0 - 5): ");
                                double nota = entrada.nextDouble();
                                if (nota >= 0 && nota <= 5) {
                                    notas[indice] = nota;
                                    System.out.println("nota registrada correctamente.");
                                } else {
                                    System.out.println("error: la nota debe estar entre 0 y 5.");
                                }
                            } else {
                                System.out.println("estudiante no valido.");
                            }
                        }
                        break;
                    case 3:
                        if (contador == 0) {
                            System.out.println("No hay estudiantes registrados.");
                        } else {
                            System.out.println("\n lista de estudiantes:");
                            for (int i = 0; i < contador; i++) {
                                System.out.println((i + 1) + ". " + estudiantes[i] +
                                        " - nota: " + (notas[i] == -1 ? "sin nota" : notas[i]));
                            }
                        }
                        break;
                    case 4:
                        if (contador == 0) {
                            System.out.println("no hay datos para calcular promedio.");
                        } else {
                            double suma = 0;
                            int cantidadNotas = 0;
                            for (int i = 0; i < contador; i++) {
                                if (notas[i] != -1) {
                                    suma += notas[i];
                                    cantidadNotas++;
                                }
                            }
                            if (cantidadNotas > 0) {
                                double promedio = suma / cantidadNotas;
                                System.out.println("promedio general: " + promedio);
                            } else {
                                System.out.println("no hay notas registradas.");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("saliendo del sistema...");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: entrada invalida.");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);
        entrada.close();
    }
}