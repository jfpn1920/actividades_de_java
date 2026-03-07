package nivel_de_practica;
import java.util.Scanner;
public class simulador_de_tienda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String producto1, producto2, producto3;
        int cantidad1, cantidad2, cantidad3;
        double precio1, precio2, precio3;
        double total1, total2, total3, totalCompra;
        System.out.println("simulador de tienda");
        System.out.print("ingrese el nombre del primer producto: ");
        producto1 = entrada.nextLine();
        System.out.print("ingrese la cantidad: ");
        cantidad1 = entrada.nextInt();
        System.out.print("ingrese el precio: ");
        precio1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("\n ingrese el nombre del segundo producto: ");
        producto2 = entrada.nextLine();
        System.out.print("ingrese la cantidad: ");
        cantidad2 = entrada.nextInt();
        System.out.print("ingrese el precio: ");
        precio2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("\n ingrese el nombre del tercer producto: ");
        producto3 = entrada.nextLine();
        System.out.print("ingrese la cantidad: ");
        cantidad3 = entrada.nextInt();
        System.out.print("ingrese el precio: ");
        precio3 = entrada.nextDouble();
        total1 = cantidad1 * precio1;
        total2 = cantidad2 * precio2;
        total3 = cantidad3 * precio3;
        totalCompra = total1 + total2 + total3;
        System.out.println("\n resumen de compra ");
        System.out.println(producto1 + " - total: $" + total1);
        System.out.println(producto2 + " - total: $" + total2);
        System.out.println(producto3 + " - total: $" + total3);
        System.out.println("total de la compra: $" + totalCompra);
        entrada.close();
    }
}