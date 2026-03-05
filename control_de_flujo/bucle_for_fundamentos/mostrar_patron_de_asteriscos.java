package bucle_for_fundamentos;
public class mostrar_patron_de_asteriscos {
    public static void main(String[] args) {
        int filas = 5; 
        System.out.println("patron de asteriscos:");
        for (int i = 1; i <= filas; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}