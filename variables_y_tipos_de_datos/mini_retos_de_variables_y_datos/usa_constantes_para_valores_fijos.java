package mini_retos_de_variables_y_datos;
public class usa_constantes_para_valores_fijos {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double radio = 4.0;
        double area = PI * radio * radio;
        System.out.println("radio: " + radio);
        System.out.println("valor de pi: " + PI);
        System.out.println("area del circulo: " + area);
    }
}