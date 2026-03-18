package conversion_de_texto_a_numero_parseint_parsedouble;
public class usa_integer_parseint {
    public static void main(String[] args) {
        String numeroTexto1 = "100";
        String numeroTexto2 = "50";
        int numero1 = Integer.parseInt(numeroTexto1);
        int numero2 = Integer.parseInt(numeroTexto2);
        int suma = numero1 + numero2;
        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);
        System.out.println("suma: " + suma);
    }
}