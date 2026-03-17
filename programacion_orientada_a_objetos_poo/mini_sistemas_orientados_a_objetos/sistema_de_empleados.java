package mini_sistemas_orientados_a_objetos;
class Empleado {
    String nombre;
    String cargo;
    double salario;
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    public void mostrarEmpleado() {
        System.out.println("nombre: " + nombre);
        System.out.println("cargo: " + cargo);
        System.out.println("salario: $" + salario);
        System.out.println("---------------------------");
    }
}
public class sistema_de_empleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", "programador", 2500);
        Empleado empleado2 = new Empleado("maria", "diseñadora", 2200);
        Empleado empleado3 = new Empleado("carlos", "administrador", 2700);
        empleado1.mostrarEmpleado();
        empleado2.mostrarEmpleado();
        empleado3.mostrarEmpleado();
    }
}