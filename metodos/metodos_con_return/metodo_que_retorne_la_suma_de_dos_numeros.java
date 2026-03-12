package metodos_con_return;
public class metodo_que_retorne_la_suma_de_dos_numeros {
    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static void main(String[] args) {
        int resultado = sumar(10, 5);
        System.out.println("la suma es: " + resultado);
    }
}