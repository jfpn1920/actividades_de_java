package introduccion_a_excepciones;
public class provocar_arithmeticexception_division_por_cero {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 0;
        try {
            int resultado = numero1 / numero2;
            System.out.println("resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        }
        System.out.println("el programa continúa ejecutandose.");
    }
}