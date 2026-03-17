package atributos;
class Empleado {
    double salario;
}
public class clase_empleado_con_salario {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.salario = 2500.75;
        System.out.println("salario del empleado: $" + empleado1.salario);
    }
}