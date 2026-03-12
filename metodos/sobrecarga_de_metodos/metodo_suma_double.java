package sobrecarga_de_metodos;
public class metodo_suma_double {
    public static double suma(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        double resultado = suma(5.5, 7.3);
        System.out.println("la suma es: " + resultado);
    }
}