package sobrecarga_de_metodos;
public class crear_mini_calculadora_sobrecargada {
    public static int suma(int a, int b) {
        return a + b;
    }
    public static double suma(double a, double b) {
        return a + b;
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("suma (int, int): " + suma(5, 3));
        System.out.println("suma (double, double): " + suma(5.5, 3.2));
        System.out.println("suma (int, int, int): " + suma(2, 4, 6));
        System.out.println("resta: " + resta(10, 4));
        System.out.println("multiplicacion: " + multiplicar(6, 3));
        System.out.println("division: " + dividir(10, 2));
    }
}