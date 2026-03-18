package constantes;
public class usa_una_constante_en_una_operacion {
    public static void main(String[] args) {
        final double DESCUENTO = 0.10; 
        double precio = 200;
        double precioFinal = precio - (precio * DESCUENTO);
        System.out.println("precio original: " + precio);
        System.out.println("descuento: " + (precio * DESCUENTO));
        System.out.println("precio final: " + precioFinal);
    }
}