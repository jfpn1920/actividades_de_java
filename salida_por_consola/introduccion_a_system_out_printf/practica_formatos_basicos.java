package introduccion_a_system_out_printf;
public class practica_formatos_basicos {
    public static void main(String[] args) {
        String producto = "camiseta";
        int cantidad = 3;
        double precio = 19.99;
        System.out.printf("producto: %s%n", producto);    
        System.out.printf("cantidad: %d%n", cantidad);    
        System.out.printf("precio: %.2f%n", precio);      
        System.out.printf("compraste %d %s(s) por un precio de %.2f cada una.%n",
                cantidad, producto, precio);
    }
}