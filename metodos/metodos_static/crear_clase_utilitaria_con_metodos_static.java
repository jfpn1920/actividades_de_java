package metodos_static;
public class crear_clase_utilitaria_con_metodos_static {
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
            System.out.println("error: division entre cero.");
            return 0;
        }
    }
    public static void main(String[] args) {
        int suma = sumar(10, 5);
        int resta = restar(10, 5);
        int mult = multiplicar(10, 5);
        double div = dividir(10, 5);
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + mult);
        System.out.println("division: " + div);
    }
}