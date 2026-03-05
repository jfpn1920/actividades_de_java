package bucle_while;
public class contador_regresivo {
    public static void main(String[] args) {
        int contador = 10; 
        System.out.println("contador regresivo:");
        while (contador >= 0) { 
            System.out.println(contador);
            contador--; 
        }
        System.out.println("¡fin del contador!");
    }
}