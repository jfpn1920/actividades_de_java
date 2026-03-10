package introduccion_a_excepciones;
public class provocar_arrayIndexoutofboundsexception {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};
        try {
            System.out.println("intentando acceder a una posicion invalida del arreglo...");
            int valor = numeros[5];
            System.out.println("valor: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: intentaste acceder a una posicion que no existe en el arreglo.");
        }
        System.out.println("el programa continua ejecutandose.");
    }
}