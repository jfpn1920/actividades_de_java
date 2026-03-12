package scope_alcance_de_variables;
public class modificar_variable_dentro_de_metodo {
    int numero = 10;
    public void modificarNumero() {
        numero = 20;
        System.out.println("el numero dentro del metodo ahora es: " + numero);
    }
    public static void main(String[] args) {
        modificar_variable_dentro_de_metodo obj = new modificar_variable_dentro_de_metodo();
        System.out.println("valor inicial del numero: " + obj.numero);
        obj.modificarNumero();
        System.out.println("valor del numero despues del metodo: " + obj.numero);
    }
}