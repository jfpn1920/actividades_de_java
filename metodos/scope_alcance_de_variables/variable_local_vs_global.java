package scope_alcance_de_variables;
public class variable_local_vs_global {
    static int variableGlobal = 10;
    public static void mostrarVariables() {
        int variableLocal = 5;
        System.out.println("variable global: " + variableGlobal);
        System.out.println("variable local: " + variableLocal);
    }
    public static void main(String[] args) {
        System.out.println("accediendo a la variable global desde main:");
        System.out.println("variable global: " + variableGlobal);
        System.out.println("\n llamando al metodo:");
        mostrarVariables();
    }
}