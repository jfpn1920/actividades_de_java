package metodos_mas_bucles;
public class metodo_que_calcule_suma_con_for {
    public static int calcularSuma(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        return suma;
    }
    public static void main(String[] args) {
        int resultado = calcularSuma(10);
        System.out.println("la suma de los numeros del 1 al 10 es: " + resultado);
    }
}