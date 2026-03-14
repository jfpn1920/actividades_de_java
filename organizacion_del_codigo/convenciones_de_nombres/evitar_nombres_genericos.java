package convenciones_de_nombres;
public class evitar_nombres_genericos {
    public static void main(String[] args) {
        int precioProducto = 100;
        int impuestoProducto = 19;
        int precioTotal = precioProducto + impuestoProducto;
        System.out.println("precio del producto: " + precioProducto);
        System.out.println("impuesto del producto: " + impuestoProducto);
        System.out.println("precio total a pagar: " + precioTotal);
    }
}