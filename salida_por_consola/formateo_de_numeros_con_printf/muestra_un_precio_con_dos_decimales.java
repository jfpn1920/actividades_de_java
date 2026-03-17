package formateo_de_numeros_con_printf;
public class muestra_un_precio_con_dos_decimales {
    public static void main(String[] args) {
        double precio = 49.9;
        System.out.printf("el precio es: $%.2f%n", precio);
    }
}