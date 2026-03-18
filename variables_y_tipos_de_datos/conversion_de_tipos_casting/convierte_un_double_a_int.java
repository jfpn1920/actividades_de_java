package conversion_de_tipos_casting;
public class convierte_un_double_a_int {
    public static void main(String[] args) {
        double numeroDecimal = 9.75;
        int numeroEntero = (int) numeroDecimal;
        System.out.println("numero decimal: " + numeroDecimal);
        System.out.println("numero entero: " + numeroEntero);
    }
}