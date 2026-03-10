package nivel_practica;
import java.util.Scanner;
public class erp_por_consola_con_manejo_de_errores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ModuloClientes clientes = new ModuloClientes();
        ModuloProductos productos = new ModuloProductos();
        ModuloVentas ventas = new ModuloVentas(productos);
        int opcion = 0;
        do {
            try {
                System.out.println("\n menu erp empresarial ");
                System.out.println("1. gestionar clientes");
                System.out.println("2. gestionar productos");
                System.out.println("3. registrar venta");
                System.out.println("4. mostrar ventas");
                System.out.println("5. salir");
                System.out.print("seleccione una opcion: ");
                opcion = Integer.parseInt(entrada.nextLine());
                switch (opcion) {
                    case 1:
                        clientes.menuClientes(entrada);
                        break;
                    case 2:
                        productos.menuProductos(entrada);
                        break;
                    case 3:
                        ventas.registrarVenta(entrada);
                        break;
                    case 4:
                        ventas.mostrarVentas();
                        break;
                    case 5:
                        System.out.println("saliendo del erp...");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: entrada invalida.");
            }
        } while (opcion != 5);
        entrada.close();
    }
}
class ModuloClientes {
    String[] clientes = new String[10];
    int contador = 0;
    public void menuClientes(Scanner entrada) {
        try {
            System.out.println("\nmodulo de los clientes ");
            System.out.println("1. agregar cliente");
            System.out.println("2. mostrar clientes");
            System.out.print("seleccione: ");
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    System.out.print("nombre del cliente: ");
                    String nombre = entrada.nextLine();
                    if (contador < clientes.length) {
                        clientes[contador] = nombre;
                        contador++;
                        System.out.println("cliente agregado.");
                    } else {
                        System.out.println("lista de clientes llena.");
                    }
                    break;
                case 2:
                    if (contador == 0) {
                        System.out.println("no hay clientes.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + clientes[i]);
                        }
                    }
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } catch (Exception e) {
            System.out.println("error en el modulo clientes.");
        }
    }
}
class ModuloProductos {
    String[] productos = new String[10];
    double[] precios = new double[10];
    int contador = 0;
    public void menuProductos(Scanner entrada) {
        try {
            System.out.println("\n modulo de los productos ");
            System.out.println("1. agregar producto");
            System.out.println("2. mostrar productos");
            System.out.print("seleccione: ");
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    System.out.print("nombre del producto: ");
                    String nombre = entrada.nextLine();
                    System.out.print("precio: ");
                    double precio = Double.parseDouble(entrada.nextLine());
                    if (contador < productos.length) {
                        productos[contador] = nombre;
                        precios[contador] = precio;
                        contador++;
                        System.out.println("producto agregado.");
                    } else {
                        System.out.println("inventario lleno.");
                    }
                    break;
                case 2:
                    if (contador == 0) {
                        System.out.println("no hay productos.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println(
                                    (i + 1) + ". " +
                                    productos[i] +
                                    " - $" + precios[i]
                            );
                        }
                    }
                    break;
                default:
                    System.out.println("opcion invalida.");
            }
        } catch (Exception e) {
            System.out.println("error en el modulo productos.");
        }
    }
}
class ModuloVentas {
    String[] ventas = new String[10];
    int contador = 0;
    ModuloProductos productos;
    public ModuloVentas(ModuloProductos productos) {
        this.productos = productos;
    }
    public void registrarVenta(Scanner entrada) {
        try {
            if (productos.contador == 0) {
                System.out.println("no hay productos registrados.");
                return;
            }
            System.out.println("\n productos disponibles ");
            for (int i = 0; i < productos.contador; i++) {
                System.out.println(
                        (i + 1) + ". " +
                        productos.productos[i] +
                        " - $" + productos.precios[i]
                );
            }
            System.out.print("seleccione producto: ");
            int indice = Integer.parseInt(entrada.nextLine()) - 1;
            if (indice >= 0 && indice < productos.contador) {
                if (contador < ventas.length) {
                    ventas[contador] = productos.productos[indice];
                    contador++;
                    System.out.println("venta registrada.");
                } else {
                    System.out.println("registro de ventas lleno.");
                }
            } else {
                System.out.println("producto invalido.");
            }
        } catch (Exception e) {
            System.out.println("error al registrar venta.");
        }
    }
    public void mostrarVentas() {
        if (contador == 0) {
            System.out.println("no hay ventas registradas.");
            return;
        }
        System.out.println("\n historial de ventas ");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + ventas[i]);
        }
    }
}