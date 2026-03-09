package recorrer_arrays_con_for;
public class multiplicar_todos_los_valores {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 5};
        int multiplicacion = 1;
        for (int i = 0; i < numeros.length; i++) {
            multiplicacion = multiplicacion * numeros[i];
        }
        System.out.println("la multiplicacion de todos los valores es: " + multiplicacion);
    }
}