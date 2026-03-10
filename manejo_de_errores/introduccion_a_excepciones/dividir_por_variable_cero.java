package introduccion_a_excepciones;
public class dividir_por_variable_cero {
    public static void main(String[] args) {
        int numero = 20;
        int divisor = 0; 
        try {
            System.out.println("intentando dividir " + numero + " entre " + divisor);
            int resultado = numero / divisor; 
            System.out.println("resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: no se puede dividir entre cero.");
        }
        System.out.println("el programa continua ejecutandose.");
    }
}