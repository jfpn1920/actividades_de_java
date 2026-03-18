package constantes;
public class diferencia_entre_variable_y_constante {
    public static void main(String[] args) {
        int edad = 18;
        edad = 20;
        final int EDAD_MAXIMA = 100;
        System.out.println("edad: " + edad);
        System.out.println("edad maxima: " + EDAD_MAXIMA);
    }
}