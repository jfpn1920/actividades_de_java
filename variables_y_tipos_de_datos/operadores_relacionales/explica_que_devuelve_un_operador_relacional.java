package operadores_relacionales;
public class explica_que_devuelve_un_operador_relacional {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        boolean mayor = numero1 > numero2;      
        boolean menor = numero1 < numero2;      
        boolean igual = numero1 == numero2;     
        boolean diferente = numero1 != numero2; 
        boolean mayorIgual = numero1 >= numero2;
        boolean menorIgual = numero1 <= numero2;
        System.out.println("mayor que: " + mayor);
        System.out.println("menor que: " + menor);
        System.out.println("igual a: " + igual);
        System.out.println("diferente de: " + diferente);
        System.out.println("mayor o igual a: " + mayorIgual);
        System.out.println("menor o igual a: " + menorIgual);
    }
}