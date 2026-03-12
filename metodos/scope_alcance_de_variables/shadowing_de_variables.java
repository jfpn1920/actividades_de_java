package scope_alcance_de_variables;
public class shadowing_de_variables {
    int numero = 10;
    public void mostrarNumero() {
        int numero = 20;
        System.out.println("variable local numero: " + numero);
        System.out.println("atributo de la clase numero: " + this.numero);
    }
    public static void main(String[] args) {
        shadowing_de_variables obj = new shadowing_de_variables();
        obj.mostrarNumero();
    }
}