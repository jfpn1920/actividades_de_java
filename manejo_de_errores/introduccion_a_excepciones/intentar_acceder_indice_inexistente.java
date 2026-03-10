package introduccion_a_excepciones;
public class intentar_acceder_indice_inexistente {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15};
        try {
            System.out.println("intentando acceder a un indice inexistente...");
            int valor = numeros[4];
            System.out.println("valor obtenido: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: El indice al que intentaste acceder no existe.");
        }
        System.out.println("el programa continua ejecutándose.");
    }
}