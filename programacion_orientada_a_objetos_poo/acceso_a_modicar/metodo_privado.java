package acceso_a_modicar;
public class metodo_privado {
    private void mensajeSecreto() {
        System.out.println("este es un metodo privado.");
    }
    public void mostrarMensaje() {
        mensajeSecreto();
    }
    public static void main(String[] args) {
        metodo_privado obj = new metodo_privado();
        obj.mostrarMensaje();
    }
}