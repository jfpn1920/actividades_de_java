package metodos_con_parametros;
public class metodo_que_reciba_precio_y_aplique_descuento {
    public static void aplicarDescuento(double precio) {
        double descuento = precio * 0.10; 
        double precioFinal = precio - descuento;
        System.out.println("precio original: $" + precio);
        System.out.println("descuento aplicado: $" + descuento);
        System.out.println("precio final: $" + precioFinal);
    }
    public static void main(String[] args) {
        aplicarDescuento(100.0);
        aplicarDescuento(250.0);
    }
}