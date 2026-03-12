package metodos_con_return;
public class metodo_que_retorne_el_mayor_de_dos_numeros {
    public static int mayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }
    public static void main(String[] args) {
        int resultado = mayor(10, 20);
        System.out.println("el mayor es: " + resultado);
    }
}