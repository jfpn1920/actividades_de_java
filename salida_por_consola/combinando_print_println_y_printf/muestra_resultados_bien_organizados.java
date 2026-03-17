package combinando_print_println_y_printf;
public class muestra_resultados_bien_organizados {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        System.out.println("resultados");
        System.out.println();
        System.out.printf("numero 1: %d%n", num1);
        System.out.printf("numero 2: %d%n", num2);
        System.out.printf("suma: %d%n", suma);
        System.out.printf("resta: %d%n", resta);
        System.out.printf("multiplicacion: %d%n", multiplicacion);
        System.out.println("======================");
    }
}