package deteccion_y_correccion_de_errores;
public class explica_el_error_y_la_solucion {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b != 0) {
            System.out.println("resultado: " + (a / b));
        } else {
            System.out.println("error, no se puede dividir entre cero");
        }
    }
}