package sobrecarga_de_metodos;
public class metodo_calcular_salario_int {
    public static int calcularSalario(int horas) {
        int pagoPorHora = 10;
        return horas * pagoPorHora;
    }
    public static void main(String[] args) {
        int horasTrabajadas = 40;
        int salario = calcularSalario(horasTrabajadas);
        System.out.println("horas trabajadas: " + horasTrabajadas);
        System.out.println("salario total: " + salario);
    }
}