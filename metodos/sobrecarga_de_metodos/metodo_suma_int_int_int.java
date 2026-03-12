package sobrecarga_de_metodos;
public class metodo_suma_int_int_int {
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int resultado = suma(4, 6, 10);
        System.out.println("la suma de los tres numeros es: " + resultado);
    }
}