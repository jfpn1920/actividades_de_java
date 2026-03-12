package creacion_de_metodos_fundamentos;
public class llamar_varios_metodos_desde_main {
    public static void mostrarSaludo() {
        System.out.println("hola, bienvenido al programa.");
    }
    public static void mostrarLinea() {
        System.out.println("------------------------------");
    }
    public static void mostrarDespedida() {
        System.out.println("gracias por usar el programa, ¡hasta luego!");
    }
    public static void main(String[] args) {
        mostrarLinea();
        mostrarSaludo();
        mostrarLinea();
        mostrarDespedida();
        mostrarLinea();
    }
}