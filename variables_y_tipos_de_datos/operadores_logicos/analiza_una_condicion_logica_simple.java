package operadores_logicos;
public class analiza_una_condicion_logica_simple {
    public static void main(String[] args) {
        int numero = 15;
        boolean esMayorQueDiez = numero > 10;
        System.out.println("el numero es: " + numero);
        System.out.println("¿es mayor que 10? " + esMayorQueDiez);
        if (esMayorQueDiez) {
            System.out.println("el numero cumple la condicion.");
        } else {
            System.out.println("el numero no cumple la condicion.");
        }
    }
}