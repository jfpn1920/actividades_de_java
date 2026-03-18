package conversion_de_tipos_casting;
public class explica_cuando_usar_casting {
    public static void main(String[] args) {
        int numeroEntero = 10;
        double numeroDecimal = numeroEntero; 
        double otroDecimal = 9.75;
        int otroEntero = (int) otroDecimal; 
        System.out.println("casting implicito (int a double): " + numeroDecimal);
        System.out.println("casting explicito (double a int): " + otroEntero);
    }
}