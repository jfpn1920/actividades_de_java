package conversion_de_tipos_casting;
public class prueba_varias_conversiones {
    public static void main(String[] args) {
        int entero = 25;
        double decimal = entero;
        double numeroDecimal = 13.87;
        int numeroEntero = (int) numeroDecimal;
        long numeroLargo = 100000L;
        int numeroInt = (int) numeroLargo;
        float numeroFloat = 5.5f;
        double numeroDouble = numeroFloat;
        System.out.println("int a double: " + decimal);
        System.out.println("double a int: " + numeroEntero);
        System.out.println("long a int: " + numeroInt);
        System.out.println("float a double: " + numeroDouble);
    }
}