package metodos_mas_bucles;
public class metodo_que_imprima_tabla_de_multiplicar {
    public static void imprimirTabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    public static void main(String[] args) {
        imprimirTabla(5);
    }
}