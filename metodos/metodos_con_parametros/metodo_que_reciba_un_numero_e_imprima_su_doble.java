package metodos_con_parametros;
public class metodo_que_reciba_un_numero_e_imprima_su_doble {
    public static void imprimirDoble(int numero) {
        int doble = numero * 2;
        System.out.println("el doble de " + numero + " es: " + doble);
    }
    public static void main(String[] args) {
        imprimirDoble(5);
    }
}