package sobrecarga_de_metodos;
public class metodo_calcular_salario_double {
    public static double calcularSalario(double horasTrabajadas) {
        double pagoPorHora = 10.5; 
        return horasTrabajadas * pagoPorHora;
    }
    public static void main(String[] args) {
        double horas = 38.5;
        double salario = calcularSalario(horas);
        System.out.println("horas trabajadas: " + horas);
        System.out.println("salario total: " + salario);
    }
}