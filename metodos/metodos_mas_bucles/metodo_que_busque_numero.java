package metodos_mas_bucles;
public class metodo_que_busque_numero {
    public static boolean buscarNumero(int[] numeros, int numeroBuscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numeros = {3, 7, 10, 15, 20};
        boolean encontrado = buscarNumero(numeros, 10);
        if (encontrado) {
            System.out.println("el numero fue encontrado.");
        } else {
            System.out.println("el numero no fue encontrado.");
        }
    }
}