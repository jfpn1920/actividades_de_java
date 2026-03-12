package metodos_con_parametros;
public class metodo_que_reciba_base_y_altura_y_calcule_area {
    public static void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("el area del rectangulo con base " + base + " y altura " + altura + " es: " + area);
    }
    public static void main(String[] args) {
        calcularArea(5.0, 3.0);
        calcularArea(7.5, 2.5);
    }
}