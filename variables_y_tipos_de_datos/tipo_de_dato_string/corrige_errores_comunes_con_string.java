package tipo_de_dato_string;
public class corrige_errores_comunes_con_string {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String texto = "hola";
        System.out.println("hola " + "mundo");
        String palabra1 = "hola";
        String palabra2 = "mundo";
        System.out.println(palabra1 + " " + palabra2);
    }
}