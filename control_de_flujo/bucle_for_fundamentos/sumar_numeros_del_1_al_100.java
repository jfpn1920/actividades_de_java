package bucle_for_fundamentos;
public class sumar_numeros_del_1_al_100 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i; 
        }
        System.out.println("la suma de los numeros del 1 al 100 es: " + suma);
    }
}