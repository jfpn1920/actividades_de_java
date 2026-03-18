package operadores_relacionales;
public class corrige_errores_de_comparacion {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        boolean resultado = (numero1 == numero2);
        System.out.println("¿son iguales?: " + resultado);
        System.out.println("¿numero 1 es mayor que numero 2?: " + (numero1 > numero2));
        int numero = 10;
        System.out.println("numero correcto: " + numero);
    }
}