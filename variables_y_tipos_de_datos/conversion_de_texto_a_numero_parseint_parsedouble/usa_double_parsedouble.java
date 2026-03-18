package conversion_de_texto_a_numero_parseint_parsedouble;
public class usa_double_parsedouble {
    public static void main(String[] args) {
        String numeroTexto1 = "12.5";
        String numeroTexto2 = "7.3";
        double numero1 = Double.parseDouble(numeroTexto1);
        double numero2 = Double.parseDouble(numeroTexto2);
        double suma = numero1 + numero2;
        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);
        System.out.println("suma: " + suma);
    }
}