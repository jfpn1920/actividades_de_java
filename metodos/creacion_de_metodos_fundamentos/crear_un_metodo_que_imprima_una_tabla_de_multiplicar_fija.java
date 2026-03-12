package creacion_de_metodos_fundamentos;
public class crear_un_metodo_que_imprima_una_tabla_de_multiplicar_fija {
    public static void imprimirTabla() {
        int numero = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    public static void main(String[] args) {
        imprimirTabla();
    }
}