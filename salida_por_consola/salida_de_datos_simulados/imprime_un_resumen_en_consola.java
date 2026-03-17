package salida_de_datos_simulados;
public class imprime_un_resumen_en_consola {
    public static void main(String[] args) {
        String cliente = "juan";
        int productos = 3;
        double total = 120.75;
        System.out.println("resumen");
        System.out.println();
        System.out.printf("cliente: %s%n", cliente);
        System.out.printf("total productos: %d%n", productos);
        System.out.printf("total a pagar: $%.2f%n", total);
        System.out.println();
        System.out.println("=============================");
    }
}