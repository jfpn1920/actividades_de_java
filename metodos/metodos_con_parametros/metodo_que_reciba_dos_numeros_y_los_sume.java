package metodos_con_parametros;
public class metodo_que_reciba_dos_numeros_y_los_sume {
    public static void sumarNumeros(int numero1, int numero2) {
        int suma = numero1 + numero2;
        System.out.println("la suma de " + numero1 + " + " + numero2 + " es: " + suma);
    }
    public static void main(String[] args) {
        sumarNumeros(10, 5);
    }
}