package convenciones_de_nombres;
public class constantes_en_mayusculas {
    public static final double PI = 3.1416;
    public static final int MAX_INTENTOS = 3;
    public static void main(String[] args) {
        double radio = 4;
        double area = PI * radio * radio;
        System.out.println("radio del circulo: " + radio);
        System.out.println("valor de pi: " + PI);
        System.out.println("area del circulo: " + area);
        System.out.println("numero maximo de intentos permitidos: " + MAX_INTENTOS);
    }
}