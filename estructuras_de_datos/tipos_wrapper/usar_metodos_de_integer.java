package tipos_wrapper;
public class usar_metodos_de_integer {
    public static void main(String[] args) {
        String texto = "100";
        int numero1 = Integer.parseInt(texto);
        Integer numero2 = Integer.valueOf(texto);
        String numeroTexto = Integer.toString(numero1);
        System.out.println("numero con parseint: " + numero1);
        System.out.println("numero con valueof: " + numero2);
        System.out.println("numero convertido a texto: " + numeroTexto);
    }

}