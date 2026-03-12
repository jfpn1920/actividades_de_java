package scope_alcance_de_variables;
public class ejercicio_completo_combinando_scope {
    int numero = 5;
    public void demostrarScope() {
        int numeroLocal = 10;
        System.out.println("variable local del metodo: " + numeroLocal);
        int numero = 20;
        System.out.println("variable local que oculta al atributo: " + numero);
        System.out.println("atributo de la clase usando this: " + this.numero);
        if (numeroLocal > 5) {
            int variableIf = 100;
            System.out.println("variable dentro del if: " + variableIf);
        }
        for (int i = 1; i <= 3; i++) {
            int variableFor = i * 2;
            System.out.println("iteracion " + i + " variable for: " + variableFor);
        }
    }
    public static void main(String[] args) {
        ejercicio_completo_combinando_scope obj = new ejercicio_completo_combinando_scope();
        obj.demostrarScope();
    }
}