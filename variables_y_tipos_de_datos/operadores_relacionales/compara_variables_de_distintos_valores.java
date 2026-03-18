package operadores_relacionales;
public class compara_variables_de_distintos_valores {
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 20;
        boolean esMayor = numero1 > numero2;
        boolean esMenor = numero1 < numero2;
        boolean esIgual = numero1 == numero2;
        System.out.println("¿numero 1 es mayor que numero 2?: " + esMayor);
        System.out.println("¿numero 1 es menor que numero 2?: " + esMenor);
        System.out.println("¿numero 1 es igual a numero 2?: " + esIgual);
    }
}