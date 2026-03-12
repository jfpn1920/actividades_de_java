package sobrecarga_de_metodos;
public class metodo_calcular_area_double {
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
    public static void main(String[] args) {
        double area = calcularArea(4.5);
        System.out.println("el area del circulo es: " + area);
    }
}