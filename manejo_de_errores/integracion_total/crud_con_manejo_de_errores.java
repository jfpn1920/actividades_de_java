package integracion_total;
import java.util.Scanner;
public class crud_con_manejo_de_errores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] usuarios = new String[5];
        int contador = 0;
        int opcion;
        do {
            System.out.println("\n sistema crud ");
            System.out.println("1. crear usuario");
            System.out.println("2. mostrar usuarios");
            System.out.println("3. actualizar usuario");
            System.out.println("4. eliminar usuario");
            System.out.println("5. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        if (contador < usuarios.length) {
                            System.out.print("ingrese el nombre del usuario: ");
                            usuarios[contador] = entrada.nextLine();
                            contador++;
                            System.out.println("usuario creado correctamente.");
                        } else {
                            System.out.println("no se pueden agregar mas usuarios.");
                        }
                        break;
                    case 2:
                        if (contador == 0) {
                            System.out.println("no hay usuarios registrados.");
                        } else {
                            System.out.println("\n lista de usuarios:");
                            for (int i = 0; i < contador; i++) {
                                System.out.println((i + 1) + ". " + usuarios[i]);
                            }
                        }
                        break;
                    case 3:
                        if (contador == 0) {
                            System.out.println("no hay usuarios para actualizar.");
                        } else {
                            System.out.print("ingrese el numero del usuario a actualizar: ");
                            int indice = entrada.nextInt() - 1;
                            entrada.nextLine();
                            if (indice >= 0 && indice < contador) {
                                System.out.print("ingrese el nuevo nombre: ");
                                usuarios[indice] = entrada.nextLine();
                                System.out.println("usuario actualizado correctamente.");
                            } else {
                                System.out.println("usuario no valido.");
                            }
                        }
                        break;
                    case 4:
                        if (contador == 0) {
                            System.out.println("no hay usuarios para eliminar.");
                        } else {
                            System.out.print("ingrese el numero del usuario a eliminar: ");
                            int indiceEliminar = entrada.nextInt() - 1;
                            if (indiceEliminar >= 0 && indiceEliminar < contador) {
                                for (int i = indiceEliminar; i < contador - 1; i++) {
                                    usuarios[i] = usuarios[i + 1];
                                }
                                contador--;
                                System.out.println("usuario eliminado correctamente.");
                            } else {
                                System.out.println("usuario no valido.");
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
                System.out.println("error: debe ingresar un numero valido.");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);
        entrada.close();
    }
}