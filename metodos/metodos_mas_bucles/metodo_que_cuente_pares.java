package metodos_mas_bucles;
public class metodo_que_cuente_pares {
    public static int contarPares(int[] numeros) {
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 11, 14, 17, 20};
        int totalPares = contarPares(numeros);
        System.out.println("cantidad de numeros pares: " + totalPares);
    }
}