package foreach_enhanced_for;
public class sumar_valores {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int numero : numeros) {
            suma = suma + numero;
        }
        System.out.println("la suma de los valores es: " + suma);
    }
}