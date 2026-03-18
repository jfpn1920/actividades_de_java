package conversion_de_tipos_casting;
public class guarda_el_resultado_convertido_en_una_variable {
    public static void main(String[] args) {
        double precio = 45.89;
        int precioEntero = (int) precio;
        System.out.println("precio original: " + precio);
        System.out.println("precio convertido a entero: " + precioEntero);
    }
}