package operadores_logicos;
public class corrige_errores_en_expresiones_logicas {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneCarnet = true;
        if (edad >= 18 && tieneCarnet) {
            System.out.println("puede conducir");
        } else {
            System.out.println("no puede conducir");
        }
    }
}