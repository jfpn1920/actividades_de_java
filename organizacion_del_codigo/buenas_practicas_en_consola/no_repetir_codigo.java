package buenas_practicas_en_consola;
public class no_repetir_codigo {
    public static void main(String[] args) {
        saludar("juan");
        saludar("maria");
        saludar("carlos");
    }
    public static void saludar(String nombre) {
        System.out.println("hola, " + nombre + ". bienvenido al programa.");
    }
}