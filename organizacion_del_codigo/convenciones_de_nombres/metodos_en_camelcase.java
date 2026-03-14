package convenciones_de_nombres;
public class metodos_en_camelcase {
    public static void main(String[] args) {
        mostrarMensaje();
        calcularSuma(5, 7);
    }
    public static void mostrarMensaje() {
        System.out.println("este metodo usa camelcase.");
    }
    public static void calcularSuma(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("la suma es: " + resultado);
    }
}