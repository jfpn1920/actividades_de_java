package metodos_con_return;
public class metodo_que_retorne_el_promedio_de_3_notas {
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
    public static void main(String[] args) {
        double promedio1 = calcularPromedio(8.5, 9.0, 7.5);
        double promedio2 = calcularPromedio(6.0, 7.0, 5.5);
        System.out.println("promedio 1: " + promedio1);
        System.out.println("promedio 2: " + promedio2);
    }
}