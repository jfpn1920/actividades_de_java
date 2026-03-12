package scope_alcance_de_variables;
public class variable_dentro_de_metodo {
    public static void mostrarMensaje() {
        String mensaje = "hola, esta variable solo existe dentro de este metodo.";
        System.out.println(mensaje);
    }
    public static void main(String[] args) {
        mostrarMensaje();
    }
}