package constantes;
public class usa_una_constante_para_un_valor_fijo {
    public static void main(String[] args) {
        final double IVA = 0.19; 
        double precio = 100;
        double total = precio + (precio * IVA);
        System.out.println("precio sin iva: " + precio);
        System.out.println("iva: " + (precio * IVA));
        System.out.println("total a pagar: " + total);
    }
}