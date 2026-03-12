package metodos_mas_bucles;
public class metodo_que_genere_patron {
    public static void generarPatron(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        generarPatron(5);
    }
}