package recorrer_arrays_con_for;
public class sumar_elementos {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("la suma de los elementos es: " + suma);
    }
}