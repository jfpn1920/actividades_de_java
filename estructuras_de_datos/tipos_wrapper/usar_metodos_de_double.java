package tipos_wrapper;
public class usar_metodos_de_double {
    public static void main(String[] args) {
        String texto = "45.67";
        double numero1 = Double.parseDouble(texto);
        Double numero2 = Double.valueOf(texto);
        String numeroTexto = Double.toString(numero1);
        System.out.println("numero con parsedouble: " + numero1);
        System.out.println("numero con valueof: " + numero2);
        System.out.println("numero convertido a texto: " + numeroTexto);
    }
}