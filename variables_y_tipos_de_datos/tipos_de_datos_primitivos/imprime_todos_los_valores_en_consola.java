package tipos_de_datos_primitivos;
public class imprime_todos_los_valores_en_consola {
    public static void main(String[] args) {
        byte numeroByte = 100;
        short numeroShort = 32000;
        int numeroInt = 1000000;
        long numeroLong = 10000000000L;
        float numeroFloat = 5.75f;
        double numeroDouble = 12345.6789;
        char letra = 'G';
        boolean esVerdadero = true;
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);
        System.out.println("char: " + letra);
        System.out.println("boolean: " + esVerdadero);
    }
}