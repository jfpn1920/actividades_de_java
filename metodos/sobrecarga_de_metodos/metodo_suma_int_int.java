package sobrecarga_de_metodos;
public class metodo_suma_int_int {
    public static int suma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int resultado = suma(5, 7);
        System.out.println("la suma es: " + resultado);
    }
}