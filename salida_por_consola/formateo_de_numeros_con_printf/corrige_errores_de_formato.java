package formateo_de_numeros_con_printf;
public class corrige_errores_de_formato {
    public static void main(String[] args) {
        String producto = "camisa";
        int cantidad = 3;
        double precio = 25.5;
        System.out.printf("producto: %s | cantidad: %d | precio: %.2f%n",
                producto, cantidad, precio);
    }
}