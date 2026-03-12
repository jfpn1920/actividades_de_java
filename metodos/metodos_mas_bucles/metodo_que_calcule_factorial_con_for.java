package metodos_mas_bucles;
public class metodo_que_calcule_factorial_con_for {
    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int numero = 5;
        long resultado = calcularFactorial(numero);
        System.out.println("el factorial de " + numero + " es: " + resultado);
    }
}