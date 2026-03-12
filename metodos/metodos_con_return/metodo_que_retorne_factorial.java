package metodos_con_return;
public class metodo_que_retorne_factorial {
    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        long fact5 = calcularFactorial(5);
        long fact7 = calcularFactorial(7);
        System.out.println("factorial de 5: " + fact5);
        System.out.println("factorial de 7: " + fact7);
    }
}