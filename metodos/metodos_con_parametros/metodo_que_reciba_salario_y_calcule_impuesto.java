package metodos_con_parametros;
public class metodo_que_reciba_salario_y_calcule_impuesto {
    public static void calcularImpuesto(double salario) {
        double impuesto = salario * 0.10; 
        double salarioNeto = salario - impuesto;
        System.out.println("salario bruto: $" + salario);
        System.out.println("impuesto aplicado: $" + impuesto);
        System.out.println("salario neto: $" + salarioNeto);
    }
    public static void main(String[] args) {
        calcularImpuesto(2000.0);
        calcularImpuesto(3500.0);
    }
}