package conversion_de_tipos_casting;
public class corrige_errores_de_casting {
    public static void main(String[] args) {
        double numeroDecimal = 15.78;
        int numeroEntero = (int) numeroDecimal;
        System.out.println("numero original: " + numeroDecimal);
        System.out.println("numero convertido: " + numeroEntero);
    }
}