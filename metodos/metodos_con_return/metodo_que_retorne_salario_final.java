package metodos_con_return;
public class metodo_que_retorne_salario_final {
    public static double calcularSalarioFinal(double salarioBase, double porcentajeDescuento) {
        double descuento = salarioBase * (porcentajeDescuento / 100.0);
        return salarioBase - descuento;
    }
    public static void main(String[] args) {
        double salario1 = calcularSalarioFinal(2000.0, 10.0); 
        double salario2 = calcularSalarioFinal(3500.0, 15.0); 
        System.out.println("salario final 1: $" + salario1);
        System.out.println("salario final 2: $" + salario2);
    }
}