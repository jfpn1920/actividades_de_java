package metodos_static;
public class crear_mini_calculadora_static {
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int restar(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División entre cero.");
            return 0;
        }
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        System.out.println("suma: " + sumar(num1, num2));
        System.out.println("resta: " + restar(num1, num2));
        System.out.println("multiplicacion: " + multiplicar(num1, num2));
        System.out.println("division: " + dividir(num1, num2));
    }
}