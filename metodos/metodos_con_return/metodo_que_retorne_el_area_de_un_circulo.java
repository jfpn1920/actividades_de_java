package metodos_con_return;
public class metodo_que_retorne_el_area_de_un_circulo {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    public static void main(String[] args) {
        double area1 = calcularAreaCirculo(3.0);
        double area2 = calcularAreaCirculo(5.0);
        System.out.println("area del circulo con radio 3.0: " + area1);
        System.out.println("area del circulo con radio 5.0: " + area2);
    }
}