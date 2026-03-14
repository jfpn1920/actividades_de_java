package proyecto_modular_basico;
public class crud_simple_organizado {
    static String nombreUsuario = "juan";
    public static void main(String[] args) {
        crearUsuario("carlos");
        leerUsuario();
        actualizarUsuario("pedro");
        eliminarUsuario();
    }
    public static void crearUsuario(String nombre) {
        nombreUsuario = nombre;
        System.out.println("usuario creado: " + nombreUsuario);
    }
    public static void leerUsuario() {
        System.out.println("usuario actual: " + nombreUsuario);
    }
    public static void actualizarUsuario(String nuevoNombre) {
        nombreUsuario = nuevoNombre;
        System.out.println("usuario actualizado a: " + nombreUsuario);
    }
    public static void eliminarUsuario() {
        nombreUsuario = null;
        System.out.println("usuario eliminado.");
    }
}