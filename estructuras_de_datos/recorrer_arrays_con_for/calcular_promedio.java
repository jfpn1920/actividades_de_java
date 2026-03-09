package recorrer_arrays_con_for;
public class calcular_promedio {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        double promedio;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        promedio = (double) suma / numeros.length;
        System.out.println("el promedio es: " + promedio);
    }
}