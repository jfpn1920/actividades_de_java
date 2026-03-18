package las_operadores_aritmeticos;
public class usa_parentesis_para_cambiar_el_orden {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int numero3 = 2;
        int sinParentesis = numero1 + numero2 * numero3;
        int conParentesis = (numero1 + numero2) * numero3;
        System.out.println("sin parentesis: " + sinParentesis);
        System.out.println("con parentesis: " + conParentesis);
    }
}