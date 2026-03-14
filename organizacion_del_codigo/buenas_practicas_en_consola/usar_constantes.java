package buenas_practicas_en_consola;
public class usar_constantes {
    public static final double PI = 3.1416;
    public static void main(String[] args) {
        double radio = 5;
        double area = PI * radio * radio;
        System.out.println("el radio del circulo es: " + radio);
        System.out.println("el valor de pi es: " + PI);
        System.out.println("el area del circulo es: " + area);
    }
}