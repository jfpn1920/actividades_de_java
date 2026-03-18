package mini_retos_de_variables_y_datos;
public class convierte_datos_de_texto_a_numero {
    public static void main(String[] args) {
        String textoNumero1 = "30";
        String textoNumero2 = "15";
        int numero1 = Integer.parseInt(textoNumero1);
        int numero2 = Integer.parseInt(textoNumero2);
        int suma = numero1 + numero2;
        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);
        System.out.println("suma: " + suma);
    }
}