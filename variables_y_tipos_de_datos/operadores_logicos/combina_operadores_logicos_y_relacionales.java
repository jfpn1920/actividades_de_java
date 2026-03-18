package operadores_logicos;
public class combina_operadores_logicos_y_relacionales {
    public static void main(String[] args) {
        int edad = 22;
        double salario = 1500.0;
        if (edad >= 18 && salario > 1000) {
            System.out.println("cumple con los requisitos.");
        } else {
            System.out.println("no cumple con los requisitos.");
        }
    }
}