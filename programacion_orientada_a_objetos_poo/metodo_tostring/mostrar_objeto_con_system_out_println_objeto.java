package metodo_tostring;
public class mostrar_objeto_con_system_out_println_objeto {
    private String producto;
    private double precio;
    public mostrar_objeto_con_system_out_println_objeto(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "producto: " + producto + " | precio: $" + precio;
    }
    public static void main(String[] args) {
        mostrar_objeto_con_system_out_println_objeto objeto =
                new mostrar_objeto_con_system_out_println_objeto("camisa", 29.99);
        System.out.println(objeto);
    }
}