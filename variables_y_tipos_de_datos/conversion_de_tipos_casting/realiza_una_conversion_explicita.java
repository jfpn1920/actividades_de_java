package conversion_de_tipos_casting;
public class realiza_una_conversion_explicita {
    public static void main(String[] args) {
        double numeroDecimal = 12.56;
        int numeroEntero = (int) numeroDecimal;
        System.out.println("numero decimal: " + numeroDecimal);
        System.out.println("numero entero (convertido): " + numeroEntero);
    }
}