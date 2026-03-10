package integracion_total;
import java.util.Scanner;
public class sistema_de_inventario_seguro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] productos = new String[5];
        int[] cantidades = new int[5];
        int contador = 0;
        int opcion;
        do {
            System.out.println("\n sistema de inventario ");
            System.out.println("1. agregar producto");
            System.out.println("2. mostrar inventario");
            System.out.println("3. actualizar cantidad");
            System.out.println("4. salir");
            System.out.print("seleccione una opcion: ");
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        if (contador < productos.length) {
                            System.out.print("ingrese el nombre del producto: ");
                            productos[contador] = entrada.nextLine();
                            System.out.print("ingrese la cantidad: ");
                            int cantidad = entrada.nextInt();
                            if (cantidad < 0) {
                                System.out.println("error: la cantidad no puede ser negativa.");
                            } else {
                                cantidades[contador] = cantidad;
                                contador++;
                                System.out.println("producto agregado correctamente.");
                            }
                        } else {
                            System.out.println("el inventario esta lleno.");
                        }
                        break;
                    case 2:
                        if (contador == 0) {
                            System.out.println("no hay productos en el inventario.");
                        } else {
                            System.out.println("\n lista de productos:");
                            for (int i = 0; i < contador; i++) {
                                System.out.println((i + 1) + ". " + productos[i] + 
                                                " - cantidad: " + cantidades[i]);
                            }
                        }
                        break;
                    case 3:
                        if (contador == 0) {
                            System.out.println("no hay productos para actualizar.");
                        } else {
                            System.out.print("ingrese el numero del producto: ");
                            int indice = entrada.nextInt() - 1;
                            if (indice >= 0 && indice < contador) {
                                System.out.print("ingrese la nueva cantidad: ");
                                int nuevaCantidad = entrada.nextInt();
                                if (nuevaCantidad < 0) {
                                    System.out.println("error: la cantidad no puede ser negativa.");
                                } else {
                                    cantidades[indice] = nuevaCantidad;
                                    System.out.println("cantidad actualizada correctamente.");
                                }
                            } else {
                                System.out.println("producto no valido.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("saliendo del sistema...");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: entrada invalida, debe ingresar un numero.");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 4);
        entrada.close();
    }
}