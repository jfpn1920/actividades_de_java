package clases_y_objetos_fundamentos;
class Empleado {
    String nombre;
    String puesto;
    double salario;
}
public class crear_clase_empleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "ana";
        empleado1.puesto = "gerente";
        empleado1.salario = 3500.50;
        System.out.println("nombre del empleado: " + empleado1.nombre);
        System.out.println("puesto: " + empleado1.puesto);
        System.out.println("salario: $" + empleado1.salario);
    }
}