package formateo_de_numeros_con_printf;
public class usa_printf_para_mejorar_presentacion {
    public static void main(String[] args) {
        String producto = "Pantalón";
        int cantidad = 2;
        double precio = 39.99;
        double total = cantidad * precio;
        System.out.printf("========== factura ==========%n");
        System.out.printf("producto : %-10s%n", producto);
        System.out.printf("cantidad : %5d%n", cantidad);
        System.out.printf("precio   : $%8.2f%n", precio);
        System.out.printf("-----------------------------%n");
        System.out.printf("total    : $%8.2f%n", total);
        System.out.printf("=============================%n");
    }
}