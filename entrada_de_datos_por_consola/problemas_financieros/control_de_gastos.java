package problemas_financieros;
import java.util.Scanner;
public class control_de_gastos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese la cantidad de gastos a registrar: ");
        int cantidadGastos = entrada.nextInt();
        entrada.nextLine(); 
        double totalGastos = 0;
        String resumenGastos = "";
        for (int i = 1; i <= cantidadGastos; i++) {
            System.out.print("ingrese la descripcion del gasto " + i + ": ");
            String descripcion = entrada.nextLine();
            System.out.print("ingrese el valor del gasto " + i + ": ");
            double valor = entrada.nextDouble();
            entrada.nextLine(); 
            totalGastos += valor;
            resumenGastos += descripcion + " - $" + valor + "\n";
        }
        System.out.println("\n resumen de gastos ---");
        System.out.println(resumenGastos);
        System.out.println("cantidad de gastos registrados: " + cantidadGastos);
        System.out.println("total de gastos: $" + totalGastos);
        entrada.close();
    }
}