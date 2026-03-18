package las_operadores_aritmeticos;
public class corrige_errores_en_operaciones_aritmeticas {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 3;
        double resultado = (double) numero1 / numero2;
        System.out.println("division correcta: " + resultado);
        int resultado2 = (numero1 + numero2) * 2;
        System.out.println("resultado con parentesis: " + resultado2);
        int numero3 = 1;
        int seguro = numero1 / numero3;
        System.out.println("division segura: " + seguro);
        
    }
}