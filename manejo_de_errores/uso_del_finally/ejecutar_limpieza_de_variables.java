package uso_del_finally;
public class ejecutar_limpieza_de_variables {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String nombre = "juan";
        int numero = 10;
        try {
            System.out.println("usando las variables...");
            System.out.println("nombre: " + nombre);
            System.out.println("numero: " + numero);
            int resultado = numero / 0;
        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        } finally {
            nombre = null;
            numero = 0;
            System.out.println("limpieza de variables realizada.");
            System.out.println("nombre ahora vale: " + nombre);
            System.out.println("numero ahora vale: " + numero);
        }
    }
}