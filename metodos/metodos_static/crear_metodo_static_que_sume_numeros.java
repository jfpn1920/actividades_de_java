package metodos_static;
public class crear_metodo_static_que_sume_numeros {
    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static void main(String[] args) {
        int resultado = sumar(10, 15);
        System.out.println("la suma es: " + resultado);
    }
}