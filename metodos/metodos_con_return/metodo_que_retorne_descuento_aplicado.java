package metodos_con_return;
public class metodo_que_retorne_descuento_aplicado {
    public static double aplicarDescuento(double precio) {
        double descuento = precio * 0.10; 
        return precio - descuento;
    }
    public static void main(String[] args) {
        double precioFinal1 = aplicarDescuento(100.0);
        double precioFinal2 = aplicarDescuento(250.0);
        System.out.println("precio con descuento de 100.0: $" + precioFinal1);
        System.out.println("precio con descuento de 250.0: $" + precioFinal2);
    }
}