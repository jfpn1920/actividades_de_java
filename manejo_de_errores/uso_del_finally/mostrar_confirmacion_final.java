package uso_del_finally;
public class mostrar_confirmacion_final {
    public static void main(String[] args) {
        try {
            System.out.println("ejecutando proceso principal...");
            int numero = 10;
            int resultado = numero / 2;
            System.out.println("resultado de la operacion: " + resultado);
        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        } finally {
            System.out.println("proceso finalizado, confirmacion mostrada al usuario.");
        }
    }
}