package integracion_total;
import java.util.Scanner;
public class simulacion_administrativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] empleados = new String[5];
        String[] cargos = new String[5];
        int contador = 0;
        int opcion;
        do {
            System.out.println("\n sistema administrativo ");
            System.out.println("1. registrar empleado");
            System.out.println("2. mostrar empleados");
            System.out.println("3. actualizar empleado");
            System.out.println("4. eliminar empleado");
            System.out.println("5. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        if (contador < empleados.length) {
                            System.out.print("ingrese el nombre del empleado: ");
                            empleados[contador] = entrada.nextLine();
                            System.out.print("ingrese el cargo del empleado: ");
                            cargos[contador] = entrada.nextLine();
                            contador++;
                            System.out.println("empleado registrado correctamente.");
                        } else {
                            System.out.println("no se pueden registrar mas empleados.");
                        }
                        break;
                    case 2:
                        if (contador == 0) {
                            System.out.println("no hay empleados registrados.");
                        } else {
                            System.out.println("\n lista de empleados:");
                            for (int i = 0; i < contador; i++) {
                                System.out.println((i + 1) + ". " + empleados[i] +
                                        " - Cargo: " + cargos[i]);
                            }
                        }
                        break;
                    case 3:
                        if (contador == 0) {
                            System.out.println("no hay empleados para actualizar.");
                        } else {
                            System.out.print("ingrese el numero del empleado a actualizar: ");
                            int indice = entrada.nextInt() - 1;
                            entrada.nextLine();
                            if (indice >= 0 && indice < contador) {
                                System.out.print("nuevo nombre: ");
                                empleados[indice] = entrada.nextLine();
                                System.out.print("nuevo cargo: ");
                                cargos[indice] = entrada.nextLine();
                                System.out.println("empleado actualizado correctamente.");
                            } else {
                                System.out.println("empleado no valido.");
                            }
                        }
                        break;
                    case 4:
                        if (contador == 0) {
                            System.out.println("no hay empleados para eliminar.");
                        } else {
                            System.out.print("ingrese el numero del empleado a eliminar: ");
                            int eliminar = entrada.nextInt() - 1;
                            if (eliminar >= 0 && eliminar < contador) {
                                for (int i = eliminar; i < contador - 1; i++) {
                                    empleados[i] = empleados[i + 1];
                                    cargos[i] = cargos[i + 1];
                                }
                                contador--;
                                System.out.println("empleado eliminado correctamente.");
                            } else {
                                System.out.println("empleado no valido.");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("saliendo del sistema administrativo...");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: eebe ingresar un numero valido.");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);
        entrada.close();
    }
}