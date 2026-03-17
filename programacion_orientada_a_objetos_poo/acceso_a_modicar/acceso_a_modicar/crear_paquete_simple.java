package acceso_a_modicar.acceso_a_modicar;
public class crear_paquete_simple {
    public void mostrarMensaje() {
        System.out.println("esta clase pertenece al paquete acceso_a_modicar.");
    }
    public static void main(String[] args) {
        crear_paquete_simple obj = new crear_paquete_simple();
        obj.mostrarMensaje();
    }
}