package metodos_con_parametros;
public class metodo_que_reciba_3_notas_y_calcule_promedio {
    public static void calcularPromedio(double nota1, double nota2, double nota3) {
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("promedio: " + promedio);
    }
    public static void main(String[] args) {
        calcularPromedio(8.5, 9.0, 7.5);
        calcularPromedio(6.0, 7.0, 5.5);
    }
}