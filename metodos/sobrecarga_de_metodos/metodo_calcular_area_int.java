package sobrecarga_de_metodos;
public class metodo_calcular_area_int {
    public static int calcularArea(int lado) {
        return lado * lado;
    }
    public static void main(String[] args) {
        int area = calcularArea(5);
        System.out.println("el area del cuadrado es: " + area);
    }
}