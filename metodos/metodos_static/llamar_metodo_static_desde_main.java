package metodos_static;
public class llamar_metodo_static_desde_main {
    public static void mostrarMensaje() {
        System.out.println("¡este metodo static fue llamado desde main!");
    }
    public static void main(String[] args) {
        mostrarMensaje();
    }
}