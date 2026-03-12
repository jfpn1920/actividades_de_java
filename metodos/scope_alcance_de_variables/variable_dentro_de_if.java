package scope_alcance_de_variables;
public class variable_dentro_de_if {
    public static void main(String[] args) {
        int numero = 10;
        if (numero > 5) {
            String mensaje = "el numero es mayor que 5";
            System.out.println(mensaje);
        }
    }
}