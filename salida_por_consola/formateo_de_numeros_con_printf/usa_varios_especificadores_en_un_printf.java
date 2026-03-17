package formateo_de_numeros_con_printf;
public class usa_varios_especificadores_en_un_printf {
    public static void main(String[] args) {
        String producto = "zapatos";
        int cantidad = 2;
        double precio = 59.99;
        System.out.printf("producto: %s | cantidad: %d | precio: $%.2f%n",
                producto, cantidad, precio);
    }
}